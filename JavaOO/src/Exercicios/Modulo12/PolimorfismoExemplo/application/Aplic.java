/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo12.PolimorfismoExemplo.application;

import Exercicios.Modulo12.PolimorfismoExemplo.entities.Account;
import Exercicios.Modulo12.PolimorfismoExemplo.entities.BusinessAccount;
import Exercicios.Modulo12.PolimorfismoExemplo.entities.SavingsAccount;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }

}
