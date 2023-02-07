/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.Alturas.application;

import Exercicios.Modulo8.Alturas.entity.Alturas;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        int qtde = 0;
        double media = 0, soma = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();

        Alturas[] vect = new Alturas[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("\nNome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();

            vect[i] = new Alturas(nome, idade, altura);

            soma += vect[i].getAltura();
        }

        media = soma / n;

        System.out.printf("\nAltura media: %.2f", media);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                qtde++;
            }
        }
        
        double porc = (double) qtde * 100 / n;
        
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", porc);
        
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        input.close();
    }

}
