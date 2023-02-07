/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo7.Conta.entity;

/**
 *
 * @author Gustavo
 */
public class Account {
    
    private Integer number;
    private String holder;
    private double balance;

    public Account(){
    }
    
    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }
    
    public Account(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
   
    public void withdraw(double amount) {
        balance -= amount + 5;
    }
    
    public String toString() {
        return "Account "
                + getNumber()
                + ", Holder: "
                + getHolder()
                + ", Balance: $ "
                + getBalance();
    }
    
}
