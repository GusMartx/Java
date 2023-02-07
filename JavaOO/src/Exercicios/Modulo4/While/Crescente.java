/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo4.While;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Crescente {

    public static void main(String[] args) {

        int x, y;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        x = input.nextInt();
        y = input.nextInt();

        while (x != y) {

            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }

            System.out.println("Digite outros dois numeros:");
            x = input.nextInt();
            y = input.nextInt();

        }

        input.close();
    }

}
