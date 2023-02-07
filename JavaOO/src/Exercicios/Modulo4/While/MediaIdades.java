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
public class MediaIdades {

    public static void main(String[] args) {

        int idade;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite as idades:");
        idade = input.nextInt();

        if (!(idade < 0)) {
            int i = 0, soma = 0;
            double media;
            
            while (idade >= 0) {
                soma += idade;
                i++;
                idade = input.nextInt();
            }

            media = (double) soma / i;
            
            System.out.printf("Media = %.2f\n", media);

        } else {
            System.out.println("Impossivel calcular");
        }

        input.close();
    }
}
