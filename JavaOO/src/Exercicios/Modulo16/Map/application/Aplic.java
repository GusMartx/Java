/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo16.Map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        //C:\ws-javaOO\JavaOO\src\Exercicios\Modulo16\Map\file.csv
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = input.nextLine();

        Map<String, Integer> votes = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");

                String name = fields[0];
                int vote = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
                    int quantityVote = votes.get(name);
                    votes.put(name, vote + quantityVote);
                } else {
                    votes.put(name, vote);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }

}
