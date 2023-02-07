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
public class Operadora {
    
    public static void main(String[] args) {
        
        double valPagar;
        int minutos;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de minutos: ");
        minutos = input.nextInt();
        
        if(minutos > 100) {
            valPagar = 50 + (2 * (minutos - 100));
        } else {
            valPagar = 50;
        }
        
        System.out.println("Valor a pagar: R$ " + valPagar);
        
        input.close();
    }
    
}
