/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week06;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LAB434_19
 */
public class Seller extends Employee{
    public Food sell(Employee e){
        if (e.getWallet().getBalance()>= Food.getPrice()){
            this.getWallet().setBalance(Food.getPrice() + this.getWallet().getBalance());
            e.getWallet().setBalance((e.getWallet().getBalance() - Food.getPrice()));
            return new Food();
        }
        else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
