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
public class Experiencias {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n, qtdeCobaia = 0, qtdeRato = 0, qtdeCoelho = 0, qtdeSapo = 0, totalCobaia = 0;
        double percRato, percSapo, percCoelho;
        
        System.out.print("Quantos casos de teste serao digitados? ");
        n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            char tipoCobaia;
            
            System.out.print("Quantidade de cobaias: ");
            qtdeCobaia = input.nextInt();
            System.out.print("Tipo de cobaia: ");
            tipoCobaia = input.next().charAt(0);
            
            totalCobaia += qtdeCobaia;
            
            if (tipoCobaia == 'R') {
                qtdeRato += qtdeCobaia;
            } else if (tipoCobaia == 'S') {
                qtdeSapo += qtdeCobaia;
            } else {
                qtdeCoelho += qtdeCobaia;
            }
            
        }
        
        percRato = (double) qtdeRato / totalCobaia * 100;
        percSapo = (double) qtdeSapo / totalCobaia * 100;
        percCoelho = (double) qtdeCoelho / totalCobaia * 100;
       
        System.out.println("\nRELATORIO FINAL:");
        System.out.println("Total: " + totalCobaia + " cobaias");
        System.out.println("Total de coelhos: " + qtdeCoelho);
        System.out.println("Total de ratos: " + qtdeRato);
        System.out.println("Total de sapos: " + qtdeSapo);
        System.out.printf("Percentual de coelhos: %.2f\n", percCoelho);
        System.out.printf("Percentual de ratos: %.2f\n", percRato);
        System.out.printf("Percentual de sapos: %.2f\n", percSapo);
        
        input.close();
    }
    
}
