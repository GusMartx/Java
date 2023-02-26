/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo14.ManipulandoArquivo.application;

import Exercicios.Modulo14.ManipulandoArquivo.model.entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        //String path = "C:\\ws-javaOO\\JavaOO\\src\\Exercicios\\Modulo14\\ManipulandoArquivo\\sourceFile.csv";
        
        Scanner input = new Scanner(System.in);
        
        List<Product> list = new ArrayList<>();
        
        System.out.print("Enter a path: ");
        String strPath = input.nextLine();
        
        File filePath = new File(strPath);
        
        String sourcePath = filePath.getParent();
        
        boolean success = new File(sourcePath + "\\out").mkdir();
        
        String folderPath = sourcePath + "\\out\\summary.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            
            String item = br.readLine();
            while (item != null) {
                String[] fields = item.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                
                list.add(new Product(name, price, quantity));
                
                item = br.readLine();
            }
            
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(folderPath))) {
                
                for (Product p : list) {
                    bw.write(p.getName() + "," + p.total());
                    bw.newLine();
                }
                
                System.out.println(folderPath + " Created: " + success);
                
            } catch (IOException e) {
                System.out.println("Error writting file: " + e.getMessage());
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        input.close();
    }
    
}
