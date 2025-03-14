/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11;

/**
 *
 * @author User
 */
public class ExceptionDemo{
    
    public static void main(String[] args) {
        try{
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            
            double x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            double x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            
            if (a == 0){
                System.out.println("Cannot divided by zero naja.");
                return;
            }
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
            
        }
        catch(NumberFormatException ex){
            System.out.println("Please input data in number format only.");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}
