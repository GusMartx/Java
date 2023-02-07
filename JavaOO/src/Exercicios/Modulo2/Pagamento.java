/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo2;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Pagamento {
    
    public static void main(String[] args) {
        
        String nome;
        double valHora, pagamento;
        int qtdeHotasTrab;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite o valor recebido por hora: ");
        valHora = input.nextDouble();
        System.out.print("Digite a quantidade trabalhada: ");
        qtdeHotasTrab = input.nextInt();
        
        pagamento = valHora * qtdeHotasTrab;
        
        System.out.printf("\nO pagamento para %s deve ser %.2f\n", nome, pagamento);
        
        input.close();
    }
    
}
