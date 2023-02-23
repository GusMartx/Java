/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo12.Pessoa.application;

import Exercicios.Modulo12.Pessoa.entities.Company;
import Exercicios.Modulo12.Pessoa.entities.Individual;
import Exercicios.Modulo12.Pessoa.entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        List<TaxPayer> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\nTax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Anual income: ");
            double income = input.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = input.nextDouble();
                
                list.add(new Individual(healthExpenditures, name, income));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = input.nextInt();
                
                list.add(new Company(numberOfEmployees, name, income));
            }
        }
        
        double totalTaxes = 0;
        
        System.out.println("\nTaxes paid:");
        for (TaxPayer p : list) {
            System.out.println(p.getName() + ": $" + String.format("%.2f", p.tax()));
            
            totalTaxes += p.tax();
        }
        
        System.out.println("\nTotal taxes: $" + String.format("%.2f", totalTaxes));
        
        input.close();
    }
    
}
