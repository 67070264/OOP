/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Salary {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days  : ");
        int numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days  : ");
        int numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        int weight = sc.nextInt();
        int salary = 0 , bonus = 0;
        if ((age >= 21) && (age <= 30)){
            salary =  (numDay1 * 300) - (numDay2 * 50); 
        }
        else if ((age >= 31) && (age <= 40)) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        }
        else if ((age >= 41) && (age <= 50)){
           salary = (numDay1 * 1000) - (numDay2 * 25);
        }
        else if ((age >= 51) && (age <= 60)){
            salary = (numDay1 * 3000);
        }
        if ((weight >= 10) && (weight <= 60)) {
            bonus = salary + 5000;
        }
        else if ((weight >= 61) && (weight <= 90)){
            bonus = salary + (5000 - (weight - 60) * 10);
        }
        else if (weight >= 91){
            bonus = salary;
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        System.out.println("Your salary and bonus is " + bonus + " Baht");
}
    }
