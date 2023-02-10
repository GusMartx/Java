/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.Comerciante.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        double totalCompra = 0, totalVenda = 0, lucro = 0;
        int qtdeMenor10 = 0, qtdeMenor20 = 0, qtdeMaior20 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Serao digitados dados de quantos produtos? ");
        int n = input.nextInt();

        String[] nome = new String[n];
        double[] precoCompra = new double[n];
        double[] precoVenda = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Produto " + (i + 1) + ":");
            System.out.print("Nome: ");
            input.nextLine();
            nome[i] = input.nextLine();
            System.out.print("Preco de compra: ");
            precoCompra[i] = input.nextDouble();
            System.out.print("Preco de venda: ");
            precoVenda[i] = input.nextDouble();

            totalCompra += precoCompra[i];
            totalVenda += precoVenda[i];
        }

        lucro = totalVenda - totalCompra;

        for (int i = 0; i < n; i++) {
            if (Math.abs(((precoVenda[i] * 100 / precoCompra[i]) - 100)) < 10) {
                qtdeMenor10++;
            } else if (Math.abs(((precoVenda[i] * 100 / precoCompra[i]) - 100)) <= 20) {
                qtdeMenor20++;
            } else {
                qtdeMaior20++;
            }

        }

        System.out.println("\nRelatorio:");
        System.out.println("Lucro abaixo de 10%: " + qtdeMenor10);
        System.out.println("Lucro entre 10% e 20%: " + qtdeMenor20);
        System.out.println("Lucro acima de 20%: " + qtdeMaior20);
        System.out.printf("Valor total de compra: %.2f\n", totalCompra);
        System.out.printf("Valor total de venda: %.2f\n", totalVenda);
        System.out.printf("Lucro total: %.2f\n", lucro);

        input.close();
    }

}
