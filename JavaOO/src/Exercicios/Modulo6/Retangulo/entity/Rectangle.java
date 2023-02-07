/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo6.Retangulo.entity;

/**
 *
 * @author Gustavo
 */
public class Rectangle {

    public double width;
    public double height;

    public double Area() {
        double area = width * height;
        return area;
    }
    
    public double Perimeter() {
        double perimeter = width * 2 + height * 2;
        return perimeter;
    }
    
    public double Diagonal() {
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return diagonal;
    }
    
    public String toString() {
        return "\nArea = "
                + String.format("%.2f", Area())
                + "\nPerimetro = "
                + String.format("%.2f", Perimeter())
                + "\nDiagonal = "
                + String.format("%.2f", Diagonal());
    }
      
}
