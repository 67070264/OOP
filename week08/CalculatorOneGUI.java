/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class CalculatorOneGUI extends JFrame{
    public CalculatorOneGUI(){
        JFrame f = new JFrame("title");
        JTextField t1 = new JTextField(40);
        JTextField t2 = new JTextField(40);
        JTextField t3 = new JTextField(60);
        JPanel j1 = new JPanel();
        JPanel j2 = new JPanel();
        JPanel j3 = new JPanel();
        JPanel j4 = new JPanel();
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multi = new JButton("*");
        JButton divi = new JButton("/");
        
        j1.setLayout(new FlowLayout());
        j2.setLayout(new GridLayout(1,1));
        j3.setLayout(new GridLayout(1,1));
        j4.setLayout(new GridLayout(1,1));
        j1.add(plus);
        j1.add(minus);
        j1.add(multi);
        j1.add(divi);
        j2.add(t1);
        j3.add(t2);
        j4.add(t3);
        f.add(j2);
        f.add(j1);
        f.add(j3);
        f.add(j4);
        f.setLayout(new GridLayout(4,1));
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
    
}
