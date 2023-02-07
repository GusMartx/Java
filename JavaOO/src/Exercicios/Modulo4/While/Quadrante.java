/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo4.While;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Quadrante {

    public static void main(String[] args) {

        int x, y;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os valores das coordenadas X e Y:");
        x = input.nextInt();
        y = input.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            } 

            System.out.println("Digite os valores das coordenadas X e Y:");
            x = input.nextInt();
            y = input.nextInt();
        }

        input.close();
    }

}
