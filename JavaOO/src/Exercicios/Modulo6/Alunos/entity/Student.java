/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo6.Alunos.entity;

/**
 *
 * @author Gustavo
 */
public class Student {

    public String name;
    public double n1, n2, n3;

    public double notaFinal() {
        return n1 + n2 + n3;
    }

    public String status() {
        if (notaFinal() >= 60) {
            return "Pass";
        } else {
            double ponto = 60 - notaFinal();
            return "Failed\nFaltaram " + ponto + " pontos";
        }
    }

    public String toString() {
        return "Nota final = "
                + notaFinal()
                + "\n"
                + status();
    }

}
