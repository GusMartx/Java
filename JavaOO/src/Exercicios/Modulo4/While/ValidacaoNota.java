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
public class ValidacaoNota {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        while (nota1 > 10 || nota1 < 0) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota1 = input.nextDouble();
        }

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        while (nota2 > 10 || nota2 < 0) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota2 = input.nextDouble();
        }

        media = (nota1 + nota2) / 2;

        System.out.println("Media = " + media);

        input.close();
    }

}