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
public class Glicose {
    
    public static void main(String[] args) {
        
        double qtdeGlicose;
        String classificacao;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a medida da glicose: ");
        qtdeGlicose = input.nextDouble();
        
        if (qtdeGlicose <= 100) {
            classificacao = "Normal";
        } else if (qtdeGlicose <= 140) {
            classificacao = "Elevado";
        } else {
            classificacao = "Diabetes";
        }
        
        System.out.println("Classificacao: " + classificacao);
        
        input.close();
    }
    
}
