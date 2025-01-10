/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week06;

/**
 *
 * @author LAB434_19
 */
public class Employee {
    private static String nationality = "Thai";
    private String name ;
    private Wallet wallet ;
    private int energy;
//    
//    public boolean equals(Employee e){
//        
//    }
//    public String toString(){
//        
//    }
//    public boolean buyFood(Seller s){
//        
//    }
    public void eat(Food f){
        this.energy += f.getEnergy();
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        
    }
    
}
