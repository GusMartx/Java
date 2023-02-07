/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo2;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Idades {

    public static void main(String[] args) {

        String nome1, nome2;
        int idade1, idade2;
        double media;

        Scanner input = new Scanner(System.in);

        System.out.println("\nDados da primeria pessoa:");
        System.out.print("Digite o nome: ");
        nome1 = input.nextLine();
        System.out.print("Digite a idade: ");
        idade1 = input.nextInt();
        
        input.nextLine();
        
        System.out.println("\nDados da segunda pessoa:");
        System.out.print("Digite o nome: ");
        nome2 = input.nextLine();
        System.out.print("Digite a idade: ");
        idade2 = input.nextInt();
        
        media = (double) (idade1 + idade2)/2;
        
        System.out.printf("\nA idade média de " + nome1+ " e " + nome2 + " é de %.1f\n", media);
        
        input.close();
    }

}
