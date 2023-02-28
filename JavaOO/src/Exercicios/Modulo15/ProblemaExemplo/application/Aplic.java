/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo15.ProblemaExemplo.application;

import Exercicios.Modulo15.ProblemaExemplo.model.entities.CarRental;
import Exercicios.Modulo15.ProblemaExemplo.model.entities.Vehicle;
import Exercicios.Modulo15.ProblemaExemplo.model.services.BrazilTaxService;
import Exercicios.Modulo15.ProblemaExemplo.model.services.RentalService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = input.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(input.nextLine(), dtf);
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(input.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        
        System.out.print("Enter price per hour: ");
        Double pricePerHour = input.nextDouble();
        System.out.print("Enter price per day: ");
        Double pricePerDay = input.nextDouble();
        
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        
        rentalService.processInvoice(cr);
        
        System.out.println("\nInvoice:");
        System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("Tax: " + cr.getInvoice().getTax());
        System.out.println("Total payment: " + cr.getInvoice().totalPayment());
        
        input.close();
    }

}
