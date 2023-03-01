/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo15.Contrato.application;

import Exercicios.Modulo15.Contrato.model.entities.Contract;
import Exercicios.Modulo15.Contrato.model.entities.Installment;
import Exercicios.Modulo15.Contrato.model.services.ContractService;
import Exercicios.Modulo15.Contrato.model.services.PayPalService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = input.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(input.next(), dtf);
        System.out.print("Contract value: ");
        double totalValue = input.nextDouble();
        
        Contract contract = new Contract(number, date, totalValue);
        
        System.out.print("Enter number of installments: ");
        int months = input.nextInt();
        
        ContractService contractService = new ContractService(new PayPalService());
        
        contractService.processContract(contract, months);
        
        System.out.println("\nInstallments:");
        for (Installment i : contract.getInstallments()) {
            System.out.println(i);
        }
        
        input.close();
    }
    
}
