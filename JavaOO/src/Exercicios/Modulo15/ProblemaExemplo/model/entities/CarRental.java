/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo15.ProblemaExemplo.model.entities;

import java.time.LocalDateTime;

/**
 *
 * @author Gustavo
 */
public class CarRental {
    
    private LocalDateTime start;
    private LocalDateTime finish;
    
    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
}
