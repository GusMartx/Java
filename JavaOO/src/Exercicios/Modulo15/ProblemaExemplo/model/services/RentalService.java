/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo15.ProblemaExemplo.model.services;

import Exercicios.Modulo15.ProblemaExemplo.model.entities.CarRental;
import Exercicios.Modulo15.ProblemaExemplo.model.entities.Invoice;
import java.time.Duration;

/**
 *
 * @author Gustavo
 */
public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;
        
        double basicPayment;
        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }
        
        double tax = taxService.tax(basicPayment);
        
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
