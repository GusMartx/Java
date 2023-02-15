/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo9.DiagonalNegativos.application;

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

        while (n > 10 || n <= 0) {
            System.out.print("Digite uma ordem entre 1 e 10: ");
            n = input.nextInt();
        }

        int[][] mat = new int[n][n];
        int qtdeNegativo = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                mat[i][j] = input.nextInt();

                if (mat[i][j] < 0) {
                    qtdeNegativo++;
                }
            }
        }

        System.out.println("\nDiagonal principal:");

        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("\nQuatidade de negativos: " + qtdeNegativo);

        input.close();
    }

}
