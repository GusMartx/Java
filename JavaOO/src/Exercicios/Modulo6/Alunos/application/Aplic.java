/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo6.Alunos.application;

import Exercicios.Modulo6.Alunos.entity.Student;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student student = new Student();

        student.name = input.nextLine();
        student.n1 = input.nextDouble();
        student.n2 = input.nextDouble();
        student.n3 = input.nextDouble();

        System.out.println(student);

        input.close();
    }

}
