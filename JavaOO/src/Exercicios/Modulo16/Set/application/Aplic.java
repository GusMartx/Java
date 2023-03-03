/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo16.Set.application;

import Exercicios.Modulo16.Set.entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        //C:\ws-javaOO\JavaOO\src\Exercicios\Modulo16\Set\in.txt
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = input.nextLine();

        Set<Product> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");

                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new Product(fields[0], moment));

                line = br.readLine();
            }
            
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }

}
