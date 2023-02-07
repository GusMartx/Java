/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo6.Cambio.application;

import Exercicios.Modulo6.Cambio.entity.CurrencyConverter;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        CurrencyConverter cc = new CurrencyConverter();
        
        System.out.print("Qual o valor do dolar: ");
        cc.cotDollar = input.nextDouble();
        
        System.out.print("Quantos dolares serao comprados: ");
        double dollar = input.nextDouble();
        cc.valReal(dollar);
        
        System.out.print("Valor a ser pago em reais: " + cc);
        System.out.println();
        
        input.close();
    }
    
}
