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
public class SenhaFixa {

    public static void main(String[] args) {

        int senha;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        senha = input.nextInt();

        while (senha != 2002) {
            System.out.print("Senha invalida. Tente novamente: ");
            senha = input.nextInt();
        }

        System.out.println("Acesso permitido!");

        input.close();
    }

}
