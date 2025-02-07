/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author LAB207_30
 */
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super(0.0);
    }
    public Ship(double fuel){
        super(fuel);
    }
    public void move(){
        fl0at();
    }
    public void move(int distance){
        for(int i = 1; i <= distance; i++){
            fl0at();
        }
    }
    @Override
    public void fl0at(){
        if (this.getFuel() >= 50){
            this.setFuel(this.getFuel() - 50);
            System.out.println("Ship moves");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void startEngine(){
        if (this.getFuel() >= 10){
            this.setFuel(this.getFuel() - 10);
            System.out.println("Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    @Override
    public void honk(){
        System.out.println("Shhhhh");
    }
}
