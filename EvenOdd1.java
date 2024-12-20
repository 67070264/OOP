/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_53
 */
import java.util.*;
public class EvenOdd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(), even = 0, odd = 0;
        while (input != -1){
            input = sc.nextInt();
            if (input % 2 != 0){
                odd += 1;
            }
            else{
                even += 1;
            }
        }
        System.out.print("Odd number = " + odd + " and Even number = " + even);
    }
}
