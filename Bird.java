/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week072;

/**
 *
 * @author COMBIT_27
 */
public abstract class Bird {
    private double wingSize;
    private double weight;
    private double height;
    
    public Bird(){
        this(0,0,0);
    }
    public Bird(double wingSize, double weight, double height){
        this.wingSize = wingSize;
        this.height = height;
        this.weight = weight;
    }
    public void eat(double food){
        if (food > 0){
            weight += food;
        }
        else{
            System.out.println("Input cannot be negative number.");
        }
    }

    public double getWingSize() {
        return wingSize;
    }

    public void setWingSize(double wingSize) {
        this.wingSize = wingSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
