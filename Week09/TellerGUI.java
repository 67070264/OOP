/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    JFrame f = new JFrame("Teller GUI");
    JPanel j1 = new JPanel();
    JPanel j2 = new JPanel();
    JPanel j3 = new JPanel();
    JPanel j4 = new JPanel();
    JButton bt1, bt2, bt3;
    JTextField t1, t2;
    Account ac = new Account(6000,"User");
    public TellerGUI(){
        JLabel balance = new JLabel("Balance");
        t1 = new JTextField(10);
        JLabel amount = new JLabel("Amount");
        t2 = new JTextField(10);
        t1.setText(String.valueOf(ac.getBalance()));
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        bt3 = new JButton("Exit");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        
        f.setLayout(new GridLayout(4,1));
        
        j1.add(balance, BorderLayout.WEST);
        j1.add(t1, BorderLayout.EAST);
        j1.setLayout(new GridLayout(1,1));
        j2.add(amount, BorderLayout.WEST);
        j2.add(t2, BorderLayout.EAST);
        j2.setLayout(new GridLayout(1,1));
        
        j3.add(bt1);
        j3.add(bt2);
        j3.add(bt3);
        j3.setLayout(new FlowLayout());
        
        f.add(j1);
        f.add(j2);
        f.add(j3);
        f.add(j4);
        
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(bt1)){
            double amount = Double.parseDouble(t2.getText());
            ac.deposit(amount);
            t1.setText(String.valueOf(ac.getBalance()));
            t2.setText("");
        }
        else if (ae.getSource().equals(bt2)){
            double amount = Double.parseDouble(t2.getText());
            if (amount <= ac.getBalance()){
                ac.withdraw(amount);
                t1.setText(String.valueOf(ac.getBalance()));
                t2.setText("");
            }
        }
        else if (ae.getSource().equals(bt3)){
            System.exit(0);
        }
    }
}
