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
import java.io.*;
import java.awt.event.*;
import java.util.*;

public class Poring implements MouseListener, Runnable{
    JFrame jf;
    JLabel lb1, lb2;
    JPanel jp1;
    Thread t;
    Random random;
    static int count = 0;
    public Poring(){
        ImageIcon icon = new ImageIcon(Poring.class.getResource("/poring.png"));
        Image img = icon.getImage().getScaledInstance(150,150,80);
        ImageIcon newImg = new ImageIcon(img);
        
        jf = new JFrame();
        lb1 = new JLabel(newImg);
        lb2 = new JLabel(String.valueOf(++count));
        jp1 = new JPanel();
        random = new Random();
        
        lb1.addMouseListener(this);
        
        t = new Thread(this);
        t.start();
        
        jp1.add(lb1);
        jp1.add(lb2);
        jf.add(jp1);
        
        
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocation(random.nextInt(800), random.nextInt(600));
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.pack();
        
    }
    
      
    
    @Override
    public void mouseClicked(MouseEvent e){
        System.exit(0);
    }
    
    @Override
    public void run(){
        while(true){
        int x = random.nextInt(11) - 5;
        int y = random.nextInt(11) - 5;
        Point p = jf.getLocation();
            try{
                jf.setLocation(p.x + x, p.y + y);
                Thread.sleep(100);
            }
            catch(InterruptedException ex){
            
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
         jf.dispose();
    }
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    
    
}
