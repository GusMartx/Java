/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo3;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class TrocoVerificado {

    public static void main(String[] args) {

        double precoUnit, dinheiroRecebido, troco;
        int qtdeComprada;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preco unitario do produto: ");
        precoUnit = input.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        qtdeComprada = input.nextInt();
        System.out.print("Digite o dinheiro recebido: ");
        dinheiroRecebido = input.nextDouble();
        
        if (dinheiroRecebido > (qtdeComprada * precoUnit)) {
            troco = dinheiroRecebido - (qtdeComprada * precoUnit);
            System.out.println("Troco: " + troco);
        } else {
            troco = (qtdeComprada * precoUnit) - dinheiroRecebido;
            System.out.println("Dinheiro insuficiente. Faltam " + troco + " reais");
        }
        
        
        input.close();
    }

}
