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
public class ParesConsecutivos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 1, soma = 0;

        while (x != 0) {
            soma = 0;

            System.out.print("Digite um numero inteiro: ");
            x = input.nextInt();

            if (x % 2 == 0) {
                int i = 0;
                int y = 0;
                while (i < 5) {
                    y += x;
                    x += 2;
                    i++;
                }
                soma = y;
            } else {
                x++;
                int i = 0;
                int y = 0;
                while (i < 5) {
                    y += x;
                    x += 2;
                    i++;
                }
                soma = y;
            }

            System.out.println("Soma = " + soma);

        }
        input.close();
    }

}
