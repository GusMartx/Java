/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo4.For;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class MediaPonderada {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("Quantos casos voce vai digitar? ");
        n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            double n1, n2, n3, media = 0;
            System.out.println("Digite tres numeros:");
            n1 = input.nextDouble();
            n2 = input.nextDouble();
            n3 = input.nextDouble();
            
            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
            System.out.printf("Meida = %.1f\n", media);
        }
        
        input.close();
    }
    
}
