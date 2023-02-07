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
public class DentroFora {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n, qtdeDentro = 0, qtdeFora = 0;
        
        System.out.print("Quantos numeros voce vai digitar? ");
        n = input.nextInt();
        
        for(int i = 0; i < n; i++) {
            int x;
            System.out.print("Digite um numero: ");
            x = input.nextInt();
            
            if(x >= 10 && x <= 20) {
                qtdeDentro++;
            } else {
                qtdeFora++;
            }
            
        }
        
        System.out.println(qtdeDentro + " dentro");
        System.out.println(qtdeFora + " fora");
        
        input.close();
    }
    
}
