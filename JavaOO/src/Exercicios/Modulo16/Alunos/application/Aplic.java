/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo16.Alunos.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Gustavo
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        
        System.out.print("How many students for course A? ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }
        
        System.out.print("How many students for course B? ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            b.add(input.nextInt());
        }
        
        System.out.print("How many students for course C? ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            c.add(input.nextInt());
        }
        
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        
        System.out.println("Total students: " + total.size());
        
        input.close();
    }
    
}
