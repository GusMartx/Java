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
public class Dardo {
    
    public static void main(String[] args) {
        
        double distancia1, distancia2, distancia3, maior;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite as tres distancias: ");
        distancia1 = input.nextDouble();
        distancia2 = input.nextDouble();
        distancia3 = input.nextDouble();
        
        if (distancia1 > distancia2 && distancia1 > distancia3) {
            maior = distancia1;
        } else if (distancia2 > distancia3) {
            maior = distancia2;
        } else {
            maior = distancia3;
        }
        
        System.out.println("Maior distancia: " + maior);
        
        input.close();
    }
    
}
