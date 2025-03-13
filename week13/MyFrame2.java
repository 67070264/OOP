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


public class MyFrame2 {
    public static void main(String[] args) {     
    JFrame jf = new JFrame();
    TimerClock clock = new TimerClock();
    Thread t = new Thread(clock);
    
    t.start();
    
    jf.add(clock);
    
    jf.setVisible(true);
    jf.setSize(500,250);
    }
}
