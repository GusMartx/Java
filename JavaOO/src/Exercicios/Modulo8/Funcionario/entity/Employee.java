/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo8.Funcionario.entity;

/**
 *
 * @author Gustavo
 */
public class Employee {
    
    private Integer id;
    private String name;
    private double salary;

    public Employee() {
    }
    
    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    
    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }
    
}
