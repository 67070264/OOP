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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
public class CalculatorTwoGUI {
        JFrame f = new JFrame();
        JPanel j1 = new JPanel();
        JPanel j2 = new JPanel();
        JPanel j3 = new JPanel();
        JPanel j4 = new JPanel();
        JPanel j5 = new JPanel();
    public CalculatorTwoGUI(){
        
        JButton num0 = new JButton("0");
        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multi = new JButton("X");
        JButton divi = new JButton("/");
        JButton equal = new JButton("=");
        JButton clear = new JButton("C");
        JTextField t1 = new JTextField(40);
        
        f.setLayout(new GridLayout(5,1));
        j1.add(t1);
        j1.setLayout(new GridLayout(1,1));
        
        j2.add(num7);
        j2.add(num8);
        j2.add(num9);
        j2.add(plus);
        j2.setLayout(new GridLayout(1,1));
        
        j3.add(num4);
        j3.add(num5);
        j3.add(num6);
        j3.add(minus);
        j3.setLayout(new GridLayout(1,1));
        
        j4.add(num1);
        j4.add(num2);
        j4.add(num3);
        j4.add(multi);
        j4.setLayout(new GridLayout(1,1));
        
        j5.add(num0);
        j5.add(clear);
        j5.add(equal);
        j5.add(divi);
        j5.setLayout(new GridLayout(1,1));
        
        f.add(j1);
        f.add(j2);
        f.add(j3);
        f.add(j4);
        f.add(j5);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}
