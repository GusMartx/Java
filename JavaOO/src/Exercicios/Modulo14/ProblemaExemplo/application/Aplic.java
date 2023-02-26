/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo14.ProblemaExemplo.application;

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
        
        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        
        input.close();
    }
    
}
