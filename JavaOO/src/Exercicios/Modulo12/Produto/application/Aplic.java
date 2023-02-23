/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo12.Produto.application;

import Exercicios.Modulo12.Produto.entities.ImportedProduct;
import Exercicios.Modulo12.Produto.entities.Product;
import Exercicios.Modulo12.Produto.entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Aplic {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner input = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = input.next().charAt(0);

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();
            if (type == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = input.nextDouble();

                list.add(new ImportedProduct(customsFee, name, price));

            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(input.next());

                list.add(new UsedProduct(manufactureDate, name, price));

            } else {
                list.add(new Product(name, price));
            }
        }

        System.out.println("\nPrice tags:");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        input.close();
    }

}
