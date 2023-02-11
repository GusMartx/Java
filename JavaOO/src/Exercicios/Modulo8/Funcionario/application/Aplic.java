/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.Funcionario.application;

import Exercicios.Modulo8.Funcionario.entity.Employee;
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

        System.out.print("How many employees will be registered? ");
        int n = input.nextInt();

        List<Employee> employee = new ArrayList<>();
        Employee objEmp = new Employee();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEmplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = input.nextInt();
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();

            objEmp = new Employee(id, name, salary);

            employee.add(objEmp);

        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = input.nextInt();

        boolean verify = false;
        for (int i = 0; i < n; i++) {
            if (employee.get(i).getId() == id) {

                System.out.print("Enter the percentage: ");
                double percentage = input.nextDouble();

                employee.get(i).increaseSalary(percentage);

                verify = true;
            }
        }

        if (!verify) {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees:");

        for (int i = 0; i < n; i++) {
            System.out.println(employee.get(i).getId() + ", " + employee.get(i).getName() + ", " + employee.get(i).getSalary());
        }

        input.close();
    }

}
