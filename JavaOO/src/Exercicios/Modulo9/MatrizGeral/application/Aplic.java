/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo9.MatrizGeral.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = input.nextInt();

        double[][] mat = new double[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                mat[i][j] = input.nextDouble();
            }
        }

        double soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > 0) {
                    soma += mat[i][j];
                }
            }
        }

        System.out.println("\nSoma dos positivos: " + soma);

        System.out.print("\nEscolha uma linha: ");
        int linha = input.nextInt();

        System.out.print("Linha escolhida: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[linha][i] + " ");
        }

        System.out.print("\n\nEscolha uma coluna: ");
        int coluna = input.nextInt();

        System.out.print("Coluna escolhida: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][coluna] + " ");
        }

        System.out.print("\n\nDiagonal principal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("\n\nMatriz alterada:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] *= mat[i][j];
                }
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }

}
