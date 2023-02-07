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
public class TempoDeJogo {
    
    public static void main(String[] args) {
        
        int horaInicial, horaFinal;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a hora inicial: ");
        horaInicial = input.nextInt();
        System.out.print("Digite a hora final: ");
        horaFinal = input.nextInt();
        
        if (horaInicial > horaFinal) {
            System.out.println("O jogo durou " + (24 - (horaInicial - horaFinal)) + " hora(s)");
        } else {
            System.out.println("O jogo durou " + (horaFinal - horaInicial) + " hora(s)");
        }
        
        input.close();
    }
    
}
