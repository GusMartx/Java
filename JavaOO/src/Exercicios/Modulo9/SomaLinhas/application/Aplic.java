/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo9.SomaLinhas.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int m = input.nextInt();
        
        while (m > 10 || m <= 0) {
            System.out.print("Digite um valor entre 1 e 10: ");
            m = input.nextInt();
        }
        
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int n = input.nextInt();
        
        while (n > 10 || n <= 0) {
            System.out.print("Digite um valor entre 1 e 10: ");
            n = input.nextInt();
        }
        
        double[] vect = new double[m];
        
        double[][] mat = new double[m][n];
        
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + "a. linha:");
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = input.nextDouble();
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                vect[i] += mat[i][j];
            }
        }
        
        System.out.println("Vetor gerado:");
        
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        
        
        input.close();
    }

}
