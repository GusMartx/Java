/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo2;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Duracao {
    
    public static void main(String[] args) {
        
        int duracao, hh, mm, ss, resto;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite os segundos: ");
        duracao = input.nextInt();
        
        hh = duracao / 3600;
        resto = duracao % 3600;

        mm = resto / 60;
        ss = resto % 60;
        
        System.out.println("Resto: " + resto);
        
        System.out.println(hh + ":" + mm + ":" + ss);
        
        input.close();
    }
    
}
