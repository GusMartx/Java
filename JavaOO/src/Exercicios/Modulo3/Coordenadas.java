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
public class Coordenadas {
    
    public static void main(String[] args) {
        
        double x, y;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Valor de X: ");
        x = input.nextDouble();
        System.out.print("Valor de Y: ");
        y = input.nextDouble();
        
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Origem");
        }
        
    }
    
}
