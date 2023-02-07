/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo4.For;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Divisao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Quantos casos voce vai digitar? ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int numerador, denominador;
            double divisao = 0;
            System.out.print("Entre com o numerador: ");
            numerador = input.nextInt();
            System.out.print("Entre com o denominador: ");
            denominador = input.nextInt();

            if (denominador == 0) {
                System.out.println("Divisao impossivel");
            } else {
                divisao = (double) numerador / denominador;
                System.out.printf("Divisao = %.2f\n", divisao);
            }
        }

        input.close();
    }

}
