/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo12.Produto.entities;

/**
 *
 * @author Gustavo
 */
public class ImportedProduct extends Product {
    
    private Double customsFee;
    
    public ImportedProduct() {
        super();
    }

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    @Override
    public String priceTag() {
        return getName() + " $" + String.format("%.2f", totalPrice()) + " (Customs fee: $" + String.format("%.2f", customsFee) + ")";
    }
    
    public Double totalPrice() {
        return getPrice() + customsFee;
    }
    
}
