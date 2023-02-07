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
public class Soma {

    public static void main(String[] args) {

        int x, y, soma = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        x = input.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = input.nextInt();
        
        soma = x + y;
        
        System.out.println("\nSoma: " + soma);
        
        input.close();
    }

}
