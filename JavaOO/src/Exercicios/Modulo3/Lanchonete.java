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
public class Lanchonete {
    
    public static void main(String[] args) {
        
        double valPagar = 0;
        int codigo, qtdeComprada;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o codigo do produto comprado: ");
        codigo = input.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        qtdeComprada = input.nextInt();
        
        switch(codigo) {
            case 1:
                valPagar = qtdeComprada * 5;
                break;
            case 2:
                valPagar = qtdeComprada * 3.5;
                break;
            case 3:
                valPagar = qtdeComprada * 4.8;
                break;
            case 4:
                valPagar = qtdeComprada * 8.9;
                break;
            case 5:
                valPagar = qtdeComprada * 7.32;
                break;
        }
        
        System.out.printf("Valor a pagar: %.2f\n", valPagar);
        
        input.close();
    }
    
}
