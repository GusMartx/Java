/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo11.Trabalhador.application;

import Exercicios.Modulo11.Trabalhador.entities.Department;
import Exercicios.Modulo11.Trabalhador.entities.HourContract;
import Exercicios.Modulo11.Trabalhador.entities.Worker;
import Exercicios.Modulo11.Trabalhador.entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();
        
        System.out.println("\nEnter worker data:");
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: ");
        String workerLevel = input.next();
        System.out.print("Base salary: ");
        double baseSalary = input.nextDouble();
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
        
        System.out.print("\nHow many contracts to this worker? ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(input.next());
            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = input.nextInt();
            
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            
            worker.addContract(contract);
        }
        
        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = input.next();
        
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        
        input.close();
    }
    
}
