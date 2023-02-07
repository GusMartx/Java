/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.SomaVetores.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = input.nextInt();
        
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];
        
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = input.nextInt();
        }
        
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = input.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }
        
        System.out.println("Vetor resultante:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", vectC[i]);
        }
        
        
        
        input.close();
    }

}
