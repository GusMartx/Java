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
public class SequenciaImpares {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int x;
        
        System.out.print("Digite o valor de X: ");
        x = input.nextInt();
        
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        input.close();
    }
    
}
