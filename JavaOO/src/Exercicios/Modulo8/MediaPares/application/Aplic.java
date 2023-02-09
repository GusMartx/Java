/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.MediaPares.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        double media = 0, soma = 0;
        int qtdePar = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {

            System.out.print("Digite um numero: ");
            vect[i] = input.nextInt();

            if (vect[i] % 2 == 0) {
                soma += vect[i];
                qtdePar++;
            }
        }
        
        if (soma == 0) {
            System.out.println("Nenhum numero par");
        } else {
            media = soma / qtdePar;
            System.out.printf("Media dos pares: %.1f\n", media);
        }

        input.close();

    }

}
