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
public class Retangulo {

    public static void main(String[] args) {

        double base;
        double altura;
        double area;
        double perimetro;
        double diagonal;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base: ");
        base = input.nextDouble();
        System.out.print("Digite a altura: ");
        altura = input.nextDouble();
        
        area = base * altura;
        perimetro = base * 2 + altura * 2;
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        
        System.out.printf("\nArea: %.4f", area);
        System.out.printf("\nPerimetro: %.4f", perimetro);
        System.out.printf("\nDiagonal: %.4f\n", diagonal);
        
        input.close();
    }

}
