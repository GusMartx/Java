/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo11.Pedido.application;

import Exercicios.Modulo11.Pedido.model.entities.Client;
import Exercicios.Modulo11.Pedido.model.entities.Order;
import Exercicios.Modulo11.Pedido.model.entities.OrderItem;
import Exercicios.Modulo11.Pedido.model.entities.Product;
import Exercicios.Modulo11.Pedido.model.entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner input = new Scanner(System.in);

        System.out.println("Entrer client data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(input.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        String status = input.next();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            input.nextLine();
            String productName = input.nextLine();
            System.out.print("Product price: ");
            double productPrice = input.nextDouble();
            System.out.print("Quantity: ");
            int quantity = input.nextInt();

            Product product = new Product(productName, productPrice);
            
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            
            order.addItem(orderItem);

        }
        
        System.out.println("\nOrder summary:");
        System.out.println(order);
        
        input.close();
    }

}
