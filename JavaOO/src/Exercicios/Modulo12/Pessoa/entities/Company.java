/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo12.Pessoa.entities;

/**
 *
 * @author Gustavo
 */
public class Company extends TaxPayer {

    private int numberOfEmployees;
    
    public Company() {
        super();
    }

    public Company(int numberOfEmployees, String name, Double anualIncome) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    @Override
    public double tax() {
        double tax = getAnualIncome();
        
        if (numberOfEmployees > 10) {
            tax *= 0.14;
        } else {
            tax *= 0.16;
        }
        
        return tax;
    }
    
    
}
