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
public class Aumento {

    public static void main(String[] args) {

        double salario, novoSalario, aumento;
        int porcentagem;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        salario = input.nextDouble();

        if (salario <= 1000) {
            porcentagem = 20;
        } else if (salario <= 3000) {
            porcentagem = 15;
        } else if (salario <= 8000) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }

        aumento = salario * porcentagem / 100;
        novoSalario = salario + aumento;

        System.out.println("Novo salario = R$ " + novoSalario);
        System.out.println("Aumento =  R$ " + aumento);
        System.out.println("Porcentagem = " + porcentagem + "%");

        input.close();
    }

}
