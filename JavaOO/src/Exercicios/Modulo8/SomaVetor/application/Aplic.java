/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.SomaVetor.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        double soma = 0, media = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();
        
        double[] vect = new double[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = input.nextDouble();
            soma += vect[i];
        }
       
        media = soma / n;
        
        System.out.print("Valores = ");
        
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.2f  ", vect[i]);
        }
        
        System.out.printf("\nSoma = %.2f", soma);
        System.out.printf("\nMedia = %.2f\n", media);
        
        input.close();
    }
    
}
