/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo13.Conta.application;

import Exercicios.Modulo13.Conta.model.entities.Account;
import Exercicios.Modulo13.Conta.model.exceptions.BusinessException;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = input.nextInt();
            System.out.print("Holder: ");
            input.nextLine();
            String holder = input.nextLine();
            System.out.print("Initial balance: ");
            double balance = input.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = input.nextDouble();

            Account acc = new Account(number, holder, balance, limit);

            System.out.print("\nEnter amount for withdraw: ");
            double withdraw = input.nextDouble();

            acc.withdraw(withdraw);
            System.out.println("New balance: " + acc.getBalance());

            input.close();

        } catch (BusinessException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }

}
