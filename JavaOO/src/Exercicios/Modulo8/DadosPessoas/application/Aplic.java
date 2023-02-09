/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.DadosPessoas.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        double alturaMulheres = 0;
        int qtdeMulheres = 0, qtdeHomens = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = input.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            genero[i] = input.next().charAt(0);

            if (genero[i] == 'F') {
                qtdeMulheres++;
                alturaMulheres += altura[i];
            } else {
                qtdeHomens++;
            }
        }

        double menorAltura = altura[0], maiorAltura = altura[0];
        
        double mediaMulher = alturaMulheres / qtdeMulheres;
        
        for (int i = 1; i < n; i++) {

            if (maiorAltura < altura[i]) {
                maiorAltura = altura[i];
            }

            if (menorAltura > altura[i]) {
                menorAltura = altura[i];
            }
        }
        
        System.out.printf("Menor altura = %.2f", menorAltura);
        System.out.printf("\nMaior altura = %.2f", maiorAltura);
        System.out.printf("\nMedia das alturas das mulheres = %.2f", mediaMulher);
        System.out.println("\nNumero de homens = " + qtdeHomens);

        input.close();
    }

}
