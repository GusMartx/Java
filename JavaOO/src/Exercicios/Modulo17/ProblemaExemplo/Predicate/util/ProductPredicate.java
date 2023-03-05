/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo17.ProblemaExemplo.Predicate.util;

import Exercicios.Modulo17.ProblemaExemplo.Predicate.entities.Product;
import java.util.function.Predicate;

/**
 *
 * @author Gustavo
 */
public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
