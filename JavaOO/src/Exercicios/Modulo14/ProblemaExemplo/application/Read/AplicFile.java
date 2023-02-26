/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo14.ProblemaExemplo.application.Read;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class AplicFile {
    
    public static void main(String[] args) {
        
        File file = new File("C:\\ws-javaOO\\JavaOO\\src\\Exercicios\\Modulo14\\ProblemaExemplo\\in.txt");
        Scanner input = null;
        
        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
    
}
