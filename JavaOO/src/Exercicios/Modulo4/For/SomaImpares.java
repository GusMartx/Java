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
public class SomaImpares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y, soma = 0;

        System.out.println("Digite dois numeros:");
        x = input.nextInt();
        y = input.nextInt();

        if (x < y) {
            for (int i = x + 1; i < y; i++) {
                if(i % 2 != 0) {
                    soma += i;
                }
            }
        } else {
            for (int i = y + 1; i < x; i++) {
                if(i % 2 != 0) {
                    soma += i;
                }
            }
        }
        
        System.out.println("Soma dos impares = " + soma);
        
        input.close();
    }

}
