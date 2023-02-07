/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.MaiorPosicao.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        double valMaior = 0;
        int posicao = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();
        
        double[] vect = new double[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = input.nextDouble();
        }
        
        for (int i = 0; i < vect.length; i++) {
            if (valMaior < vect[i]) {
                valMaior = vect[i];
                posicao = i;
            }
        }
        
        System.out.printf("\nMaior valor = %.1f\n", valMaior);
        System.out.println("Posicao do maior valor = " + posicao);
        
        input.close();
    }
    
}
