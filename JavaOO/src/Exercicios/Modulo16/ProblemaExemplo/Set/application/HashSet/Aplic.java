/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo16.ProblemaExemplo.Set.application.HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
        
    }

}
