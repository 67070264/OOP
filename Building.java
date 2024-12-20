/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_53
 */
import java.util.*;
public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert building's height: ");
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= 9; j++){
                if (j % 2 == 0){
                    System.out.print("-");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
}
