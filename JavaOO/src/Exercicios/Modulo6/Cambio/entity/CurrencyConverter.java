/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo6.Cambio.entity;

/**
 *
 * @author Gustavo
 */
public class CurrencyConverter {
    
    public double cotDollar;
    
    public void valReal(double dollar) {
        cotDollar = dollar * cotDollar;
        cotDollar += cotDollar * 0.06;
    }
    
    public double valPay() {
        return cotDollar;
    }
    
    public String toString() {
        return String.format("%.2f", valPay());
    }
    
}
