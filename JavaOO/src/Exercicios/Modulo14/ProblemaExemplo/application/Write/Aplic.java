/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo14.ProblemaExemplo.application.Write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good morning" , "Good afternoon", "Good evening"};
        
        String path = "C:\\ws-javaOO\\JavaOO\\src\\Exercicios\\Modulo14\\ProblemaExemplo\\out.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
