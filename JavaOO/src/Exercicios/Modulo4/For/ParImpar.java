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
public class ParImpar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int x;
            System.out.print("Digite um numero: ");
            x = input.nextInt();

            if (x == 0) {
                System.out.println("Nulo");
            } else {
                if (x % 2 == 0) {
                    System.out.print("Par");
                } else {
                    System.out.print("Impar");
                }
            
                if (x < 0) {
                    System.out.println(" negativo");
                } else {
                    System.out.println(" positivo");
                }
            }
        }

        input.close();
    }

}
