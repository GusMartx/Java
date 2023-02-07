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
public class MenorDeTres {

    public static void main(String[] args) {

        int num1, num2, num3, menor;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        num1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        num2 = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        System.out.println("Menor = " + menor);

        input.close();

    }

}
