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
public class Combustivel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codCombustivel;
        int qtdeAlcool = 0, qtdeGasolina = 0, qtdeDiesel = 0;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        codCombustivel = input.nextInt();

        while (codCombustivel != 4) {

            if (codCombustivel == 1) {
                qtdeAlcool++;
            } else if (codCombustivel == 2) {
                qtdeGasolina++;
            } else if (codCombustivel == 3) {
                qtdeDiesel++;
            }
            
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            codCombustivel = input.nextInt();

        }

        System.out.println("Muito obrigado");
        System.out.println("Alcool: " + qtdeAlcool);
        System.out.println("Gasolina: " + qtdeGasolina);
        System.out.println("Diesel: " + qtdeDiesel);

        input.close();
    }

}
