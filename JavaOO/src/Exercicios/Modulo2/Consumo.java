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
public class Consumo {
    
    public static void main(String[] args) {
        
        double combustivelGasto, consumo;
        int distanciaPercorrida;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a distancia percorrida: ");
        distanciaPercorrida = input.nextInt();
        System.out.print("Digite o combustivel gato: ");
        combustivelGasto = input.nextDouble();
        
        consumo = distanciaPercorrida / combustivelGasto;
        
        System.out.printf("\nConsumo medio: %.3f\n", consumo);
        
        input.close();
    }
    
}
