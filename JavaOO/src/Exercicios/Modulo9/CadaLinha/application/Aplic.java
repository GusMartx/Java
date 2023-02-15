/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo9.CadaLinha.application;

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
        int[] maiorLinha = new int[n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                mat[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            int maior = mat[i][0];
            for (int j = 0; j < mat[i].length; j++) {
                if (maior < mat[i][j]) {
                    maior = mat[i][j];
                }
            }
            maiorLinha[i] = maior;
        }

        System.out.println("\nMaior elemento de cada linha:");

        for (int i = 0; i < maiorLinha.length; i++) {
            System.out.println(maiorLinha[i]);
        }

        input.close();
    }

}
