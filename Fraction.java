/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public String toFloat(){
        return ((double)topN / btmN)+"";
    }
    public void addFraction(Fraction f){
        if (this.btmN == f.btmN){
            this.topN = this.topN + f.topN;
        }
        else if (this.btmN != f.btmN){
            this.topN = (this.topN * f.btmN) + (f.topN * this.btmN);
            this.btmN = this.btmN * f.btmN;
        }
    }
}

