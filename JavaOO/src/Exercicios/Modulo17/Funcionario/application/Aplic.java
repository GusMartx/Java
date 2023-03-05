/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo17.Funcionario.application;

import Exercicios.Modulo17.Funcionario.model.entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        //C:\ws-javaOO\JavaOO\src\Exercicios\Modulo17\Funcionario\file.csv
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = input.nextLine();

        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = input.nextDouble();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");

            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted().collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }

}
