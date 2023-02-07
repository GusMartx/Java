/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo4.For;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n, fatorial = 1;
        
        System.out.print("Digite o valor de N: ");
        n = input.nextInt();
        
        for(int i = n; i > 1; i--) {
            fatorial *= i;
        }
        
        System.out.println("Fatorial = " + fatorial);
        
        input.close();
    }
    
}
