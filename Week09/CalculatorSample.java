/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week09;
/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener{
        JFrame f = new JFrame("Calculator");
        JPanel j1 = new JPanel();
        JPanel j2 = new JPanel();
        JPanel j3 = new JPanel();
        JPanel j4 = new JPanel();
        JPanel j5 = new JPanel();
        JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, plus, minus, multi, divi, equal, clear;
        JTextField t1;
        String numValue = "", operator = "";
        double value1 = 0;
    public CalculatorSample(){
        
        num0 = new JButton("0");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        plus = new JButton("+");
        minus = new JButton("-");
        multi = new JButton("*");
        divi = new JButton("/");
        equal = new JButton("=");
        clear = new JButton("C");
        
        num0.addActionListener(this);
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multi.addActionListener(this);
        divi.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);
        
        t1 = new JTextField(40);
        
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
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String value = ae.getActionCommand();
        if ("0123456789".contains(value)){
            numValue += value;
            t1.setText(numValue);
            System.out.println(numValue);
        }
        else if (value.equals("C")){
            operator = "";
            numValue = "";
            value1 = 0;
            t1.setText("");
        }
        else if ("+-*/".contains(value)){
            if (!numValue.isEmpty()){
                value1 = Double.parseDouble(numValue);
                operator = value;
                numValue = "";
                t1.setText("");
            }
        }
        else if (value.equals("=")){
            if (!numValue.isEmpty() && !operator.isEmpty()){
                double value2 = Double.parseDouble(numValue);
                double result = 0;
                
                if (operator.equals("+")){
                    result = value1 + value2;
                }
                else if (operator.equals("-")){
                    result = value1 - value2;
                }
                else if (operator.equals("*")){
                    result = value1 * value2;
                }
                else if (operator.equals("/")){
                    if (value2 != 0){
                        result = value1 / value2;
                    }
                    else{
                        t1.setText("Can't divided by Zero.");
                        return;
                    }
                }
                t1.setText(String.valueOf(result));
                numValue = String.valueOf(result);
                operator = "";
            }
        }
    }
}
