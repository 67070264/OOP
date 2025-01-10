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
public class Programmer extends Employee{
    private int happiness;
    
    public void coding(String str){
        if (this.getEnergy() >= 30){
            System.out.println("Your code is"+ str);
            this.setEnergy(this.getEnergy() - 30);
            this.setHappiness(this.getHappiness() - 30);
        }
        else{
            System.out.println("Error Error Error");
            this.setEnergy(this.getEnergy() - 30);
            this.setHappiness(this.getHappiness() - 30);
        }
    }
    public void coding(char str){
        this.coding(str + "");
    }
    public int getHappiness(){
        return happiness;
    }
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
}

