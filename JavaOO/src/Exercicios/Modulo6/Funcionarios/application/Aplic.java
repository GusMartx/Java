/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo6.Funcionarios.application;

import Exercicios.Modulo6.Funcionarios.entity.Employee;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = input.nextLine();

        System.out.print("Salario bruto: ");
        employee.grossSalary = input.nextDouble();

        System.out.print("Imposto: ");
        employee.tax = input.nextDouble();

        System.out.println("\nFuncionario: " + employee);
        
        System.out.print("Qual a porcentagem para aumentar o salario: ");
        double porc = input.nextDouble();
        employee.increaseSalary(porc);
        
        System.out.println("\nDados atualizados: " + employee);
        
        input.close();
    }

}
