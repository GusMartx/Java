/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo6.Retangulo.application;

import Exercicios.Modulo6.Retangulo.entity.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Entre com a largura e altura do retângulo: ");
        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();
        
        System.out.println(rectangle);
        
        input.close();
    }
    
}
