/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.MaisVelho.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai digitar: ");
        int n = input.nextInt();
        
        int[] idade = new int[n];
        String[] nome = new String[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Dados da " + (i + 1) + " pessoa:");
            System.out.print("Nome: ");
            input.nextLine();
            nome[i] = input.nextLine();
            System.out.print("Idade: ");
            idade[i] = input.nextInt();
            
        }
        
        int posicao = 0;
        int maiorIdade = idade[0];
        
        for (int i = 1; i < n; i++) {
            if (maiorIdade < idade[i]) {
                maiorIdade = idade[i];
                posicao = i;
            }
        }
        
        System.out.println("Pessoa mais velha: " + nome[posicao]);
        
        input.close();
    }
    
}
