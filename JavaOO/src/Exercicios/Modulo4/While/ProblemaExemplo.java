/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo4.While;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ProblemaExemplo {
    
    public static void main(String[] args) {
        
        int numero, soma = 0;
        
        Scanner input = new Scanner(System.in);
        
        numero = input.nextInt();
        
        while(numero != 0) {
            soma += numero;
            numero = input.nextInt();
        }
        
        System.out.println(soma);
        
        input.close();
    }
    
}
