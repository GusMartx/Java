/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.Aprovados.application;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        double media = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos alunos serao digitados? ");
        int n = input.nextInt();
        
        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            input.nextLine();
            nome[i] = input.nextLine();
            nota1[i] = input.nextDouble();
            nota2[i] = input.nextDouble();
        }
        
        System.out.println("Alunos aprovados:");
        
        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;
            
            if (media >= 6) {
                System.out.println(nome[i]);
            }
        }
        
        input.close();
    }
    
}
