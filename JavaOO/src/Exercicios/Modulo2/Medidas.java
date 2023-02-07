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
public class Medidas {
    
    public static void main(String[] agrs) {
        
        double a, b, c, quadrado, triangulo, trapezio;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a medida A: ");
        a = input.nextDouble();
        System.out.print("Digite a medida B: ");
        b = input.nextDouble();
        System.out.print("Digite a medida C: ");
        c = input.nextDouble();
        
        quadrado = a * a;
        triangulo = a * b / 2;
        trapezio = (a + b) * c / 2;
        
        System.out.printf("\nArea do quadrado: %.4f", quadrado);
        System.out.printf("\nArea do triangulo: %.4f", triangulo);
        System.out.printf("\nArea do trapezio: %.4f\n", trapezio);
        
        input.close();
    }
    
}
