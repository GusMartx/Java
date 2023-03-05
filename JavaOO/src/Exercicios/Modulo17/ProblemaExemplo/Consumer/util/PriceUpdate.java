/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo17.ProblemaExemplo.Consumer.util;

import Exercicios.Modulo17.ProblemaExemplo.Consumer.entities.Product;
import java.util.function.Consumer;

/**
 *
 * @author Gustavo
 */
public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
