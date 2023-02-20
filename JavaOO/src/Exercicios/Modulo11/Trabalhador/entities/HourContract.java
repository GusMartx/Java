/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo11.Trabalhador.entities;

import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class HourContract {
    
    private Date date;
    private double valuePerHour;
    private Integer hours;

    public HourContract() {
    }
    
    public HourContract(Date date, double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    
    public double totalValue() {
        return valuePerHour * hours;
    }
    
}
