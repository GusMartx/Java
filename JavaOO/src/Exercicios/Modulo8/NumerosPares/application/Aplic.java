/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.NumerosPares.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        int qtdePar = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();
        
        int[] vect = new int[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = input.nextInt();
            
            if (vect[i] % 2 == 0) {
                qtdePar++;
            }
        }
        
        System.out.println("\nNumeros pares:");
        
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d  ", vect[i]);
            }
        }
        
        System.out.println("\n\nQuantidade de pares = " + qtdePar);
        
        input.close();
    }
    
}
