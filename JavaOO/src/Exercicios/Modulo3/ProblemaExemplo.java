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
public class ProblemaExemplo {
    
    public static void main(String[] args) {
        
        int valor;
        String dia;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero de 1 a 7: ");
        valor = input.nextInt();
        
        if (valor == 1) {
            dia = "domingo";
        } else if (valor == 2) {
            dia = "segunda";
        } else if (valor == 3) {
            dia = "terca";
        } else if (valor == 4) {
            dia = "quarta";
        } else if (valor == 5) {
            dia = "quinta";
        } else if (valor == 6) {
            dia = "sexta";
        } else if (valor == 7) {
            dia = "sabado";
        } else {
            dia = "valor invalido";
        }
        
        System.out.println("Dia da semana: " + dia);
        
        input.close();
    }
    
}
