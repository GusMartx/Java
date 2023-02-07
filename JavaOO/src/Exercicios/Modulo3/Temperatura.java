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
public class Temperatura {
 
    public static void main(String[] args) {
        
        char tipoTemperatura;
        double temperatura, valTemp;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        tipoTemperatura = input.next().charAt(0);
        
        if(tipoTemperatura == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = input.nextDouble();
            
            valTemp = (temperatura - 32) / 1.8;
            
            System.out.printf("Temperatura equivalente em Celsius: %.2f\n", valTemp);
        } else {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = input.nextDouble();
            
            valTemp = 1.8 * temperatura + 32;
            
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", valTemp);
        }
        
        input.close();
    }
    
}
