/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo11.Pedido.model.entities;

/**
 *
 * @author Gustavo
 */
public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuatity() {
        return quantity;
    }

    public void setQuatity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return product.getPrice() * quantity;
    }
    
    public String toString() {
        return product.getName()
                + ", $" + String.format("%.2f", price)
                + ", Quantity: " + quantity
                + ", Subtotal: $" 
                + String.format("%.2f", subTotal());
    }
}
