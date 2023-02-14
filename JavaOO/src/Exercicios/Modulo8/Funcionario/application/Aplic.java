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

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEmployee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = input.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken! Try another id: ");
                id = input.nextInt();
            }

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salary: ");
            Double salary = input.nextDouble();

            Employee objEmp = new Employee(id, name, salary);

            list.add(objEmp);

        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = input.nextInt();

        /*
        Employee emp = list.stream(x -> x.getId() == id).findFirst().orElse(null);
        
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();

            emp.increaseSalary(percentage);
        }
        */
        
        boolean verify = false;
        for (int i = 0; i < n; i++) {
            if (list.get(i).getId() == id) {
                System.out.print("Enter the percentage: ");
                double percentage = input.nextDouble();

                list.get(i).increaseSalary(percentage);

                verify = true;
            }
        }

        if (!verify) {
            System.out.println("This id does not exist!");
        }

        System.out.println();

        for (Employee emp : list) {
            System.out.println(emp);
        }

    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
