/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

/**
 *
 * @author User
 */
import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    ArrayList acct;
    
    private int numOfAccount;
    
    public Customer(){
        this("","");
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void addAccount(Account account){
        acct.add(account);
        numOfAccount += 1;
    }
    public Account getAccount(int index){
        return (Account) acct.get(index);
    }
    public int getNumOfAccount(){
        return acct.size();
    }
    @Override
    public String toString(){
        return firstName + "-" + lastName + " " + numOfAccount;
    }
    public boolean equals(Customer c){
        if (this.firstName .equals(c.firstName) & (this.lastName .equals(c.lastName))){
            return true;
        }
        else{
            return false;
        }
    }
}
