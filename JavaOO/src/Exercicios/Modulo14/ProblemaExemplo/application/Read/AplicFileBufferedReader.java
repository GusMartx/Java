/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo14.ProblemaExemplo.application.Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gustavo
 */
public class AplicFileBufferedReader {
    
    public static void main(String[] args) {
        
        String path = "C:\\ws-javaOO\\JavaOO\\src\\Exercicios\\Modulo14\\ProblemaExemplo\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            
            String line = br.readLine();
            
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
