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
public class Circulo {

    public static void main(String[] args) {

        double raio, area;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio do circulo: ");
        raio = input.nextDouble();
        
        area = Math.PI * Math.pow(raio, 2);
        
        System.out.printf("\nArea: %.3f\n", area);
        
        input.close();
    }

}
