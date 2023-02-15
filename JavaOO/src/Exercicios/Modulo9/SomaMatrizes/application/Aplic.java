/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo9.SomaMatrizes.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas linhas vai ter cada matriz? ");
        int m = input.nextInt();
        
        while (m > 10 || m <= 0) {
            System.out.print("Digite um valor entre 1 e 10: ");
            m = input.nextInt();
        }
        
        System.out.print("Quantas colunas vai ter cada matriz? ");
        int n = input.nextInt();
        
        while (n > 10 || n <= 0) {
            System.out.print("Digite um valor entre 1 e 10: ");
            n = input.nextInt();
        }
        
        int[][] matA = new int[m][n];
        int[][] matB = new int[m][n];
        int[][] matC = new int[m][n];
        
        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matA[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matB[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < matC.length; i++) {
            for (int j = 0; j < matC[i].length; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
                
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
    
}
