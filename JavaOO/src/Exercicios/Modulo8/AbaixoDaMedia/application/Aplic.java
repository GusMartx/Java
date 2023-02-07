/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.AbaixoDaMedia.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        double soma = 0, media = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = input.nextDouble();

            soma += vect[i];
        }

        media = soma / vect.length;

        System.out.printf("\nMedia do vetor = %.3f\n", media);

        System.out.println("Elementos abaixo da media:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f\n", vect[i]);
            }
        }

        input.close();
    }

}
