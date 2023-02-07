/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo3;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Multiplos {

    public static void main(String[] args) {

        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        input.close();
    }

}
