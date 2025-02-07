/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author LAB207_30
 */
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel(){
        return fuel;
    }
    public Vehicle(){
        this.fuel = 0.0;
    }
    public Vehicle(double fuel){
        this.fuel = fuel;
    }
    public void addFuel(double fuel){
        if (fuel > 0){
            this.setFuel(this.getFuel() + fuel);
        }
        else{
            System.out.println("Fuel is empty.");
        }
    }
    public abstract void honk();
}
