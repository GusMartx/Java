/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo9.AcimaDiagonal.application;

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

        int[][] mat = new int[n][n];
        int soma = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                mat[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i < j) {
                    soma += mat[i][j];
                }
            }
        }

        System.out.println("Soma dos elementos acima da diagonal principal: " + soma);

        input.close();
    }

}
