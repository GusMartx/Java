/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo16.ProblemaExemplo.Map.application;

import Exercicios.Modulo16.ProblemaExemplo.Map.entities.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {
        
        Map<Product, Double> stock = new HashMap<>();
        
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);
        
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        
        Product ps = new Product("Tv", 900.0);
        
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }

}
