/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week13;

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PoringConstructor implements ActionListener{
    JButton add;
    JFrame jf;
    JPanel jp;
    
    public PoringConstructor(){
        jf = new JFrame();
        jp = new JPanel();
        add = new JButton("Add");
        
        add.addActionListener(this);
        
        jp.add(add, BorderLayout.CENTER);
        jf.add(jp);
        
        jf.setVisible(true);
        jf.setLocation(700,400);
        jf.setSize(100,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(add)){
            Thread t = new Thread(new Poring());
            t.start();
        }
    }
    
    public static void main(String[] args) {
        new PoringConstructor();
    }
}
