/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo3;

import java.text.ChoiceFormat;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Notas {
    
    public static void main(String[] args) {
        
        double nota1, nota2, notaFinal;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        
        notaFinal = nota1 + nota2;
        
        System.out.printf("Nota Final: %.1f\n", notaFinal);
        
        if(notaFinal < 60) {
            System.out.println("Reprovado");
        }
        
        input.close();
    }
    
}
