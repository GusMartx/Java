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
public class Baskara {
    
    public static void main(String[] args) {
        
        double a, b, c, x1, x2, delta;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o coeficiente A: ");
        a = input.nextDouble();
        System.out.print("Digite o coeficiente B: ");
        b = input.nextDouble();
        System.out.print("Digite o coeficiente C: ");
        c = input.nextDouble();
        
        delta = Math.pow(b, 2) - 4 * a * c;
        
        x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
        
        if (!(delta < 0)) {        
            System.out.printf("\nX1 = %.4f", x1);
            System.out.printf("\nX2 = %.4f\n", x2);
        } else {
            System.out.println("Esta equacao nao possui raizes reais");
        }
        
        input.close();
    }
    
}
