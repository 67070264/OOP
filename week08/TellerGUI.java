/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    JFrame f = new JFrame("Teller GUI");
    JPanel j1 = new JPanel();
    JPanel j2 = new JPanel();
    JPanel j3 = new JPanel();
    JPanel j4 = new JPanel();
    public TellerGUI(){
        JLabel balance = new JLabel("Balance");
        JTextField t1 = new JTextField(10);
        JLabel amount = new JLabel("Amount");
        JTextField t2 = new JTextField(10);
        JButton bt1 = new JButton("Deposit");
        JButton bt2 = new JButton("Withdraw");
        JButton bt3 = new JButton("Exit");
        
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
        
        //f.add(balance, BorderLayout.WEST);
        //f.add(t1, BorderLayout.EAST);
        //f.add(amount, BorderLayout.WEST);
        //f.add(t2, BorderLayout.EAST);
        f.add(j1);
        f.add(j2);
        f.add(j3);
        f.add(j4);
        
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
