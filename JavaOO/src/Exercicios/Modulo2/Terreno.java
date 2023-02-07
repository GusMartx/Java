/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Terreno {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        double largura;
        double comprimento;
        double valQuadrado;
        double area;
        double preco;
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite a largura: ");
            largura = input.nextDouble();
            System.out.print("\nDigite o comprimento: ");
            comprimento = input.nextDouble();
            System.out.print("\nDigite o valor por metro quadrado: ");
            valQuadrado = input.nextDouble();
        }
        
        area = largura * comprimento;
        preco = area * valQuadrado;
        
        System.out.printf("\nArea do terreno: %.2f\nPreco do terreno: %.2f\n", area, preco);
        
    }
}
