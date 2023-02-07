/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo7.Conta.application;

import Exercicios.Modulo7.Conta.entity.Account;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        Integer number = input.nextInt();
        System.out.print("Enter account holder: ");
        input.nextLine();
        String holder = input.nextLine();

        System.out.print("Is there an initial deposit(y/n)? ");
        char i = input.next().charAt(0);

        Account ac = new Account();
        
        if (i == 'n') {
            ac = new Account(number, holder);
        } else {
            System.out.print("Enter initial deposit value: ");
            double balance = input.nextDouble();
            ac = new Account(number, holder, balance);
        }
        
        System.out.println("\nAccount data:\n" + ac);
        
        System.out.print("\nEnter a deposit value: ");
        double amount = input.nextDouble();
        ac.deposit(amount);
        
        System.out.println("Updated account data:\n" + ac);
        
        System.out.print("\nEnter a withdraw data: ");
        amount = input.nextDouble();
        ac.withdraw(amount);
        
        System.out.println("Updated account data:\n" + ac);

        input.close();
    }

}
