/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo14.ProblemaExemplo.application.Manipulation;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a folder path: ");
        String strPath = input.nextLine();
        
        File path = new File(strPath);
        
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");
        for (File folder : folders) {
            System.out.println(folder);
        }
        
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files:");
        for (File file : files) {
            System.out.println(file);
        }
                
        boolean success = new File(strPath + "\\newFolder").mkdir();
        System.out.println("Directory created successfully: " + success);
        
        input.close();
    }
    
}
