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
public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("Deseja a tabuada para qual valor? ");
        n = input.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        
        input.close();
    }
    
}
