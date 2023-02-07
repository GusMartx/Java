/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo1;

import java.util.Locale;

/**
 *
 * @author Gustavo
 */
public class ExercicioFixacao {
    
    public static void main(String[] args) {
        
        String product1 = "Computer";
        String product2 = "Office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is %.2f\n\nRecord: %d years old, code %d and gender: %s\n\nMeasure with eight decimal places: %.8f\nRounded (three decimal places): %.3f", product1, price1, product2, price2, age, code, gender, measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f\n", measure);
    }
    
}
