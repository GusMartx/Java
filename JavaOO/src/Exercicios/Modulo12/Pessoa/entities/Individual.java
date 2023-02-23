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
public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(Double healthExpenditures, String name, Double anualIncome) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax = getAnualIncome();
        
        if (tax < 20000) {
            tax = tax * 0.15 - healthExpenditures / 2;
        } else {
            tax = tax * 0.25 - healthExpenditures / 2;
        }
        
        return tax;
    }

}
