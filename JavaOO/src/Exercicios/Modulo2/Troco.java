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
public class Troco {
    
    public static void main(String[] args) {
        
        double precoUnit, recebimento, troco;
        int qtdeComprada;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Preço unitário do produto: ");
        precoUnit = input.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtdeComprada = input.nextInt();
        System.out.print("Dinheiro recebido: ");
        recebimento = input.nextDouble();
        
        troco = recebimento - (qtdeComprada * precoUnit);
        
        System.out.printf("\nTroco = %.2f\n", troco);
        
        input.close();
    }
    
}
