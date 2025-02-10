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
public class MDIFromGUI {
    JFrame f = new JFrame();
    JDesktopPane dp = new JDesktopPane();
    JInternalFrame childFrame1 = new JInternalFrame("Application 1", true, true, true);
    JInternalFrame childFrame2 = new JInternalFrame("Application 2",true, true, true);
    JInternalFrame childFrame3 = new JInternalFrame("Application 3",true, true, true);
    JMenuBar mb = new JMenuBar();
    JMenu m1 ,m2, m3, m4; 
    JMenuItem mi1, mi2, mi3, mi4, mi5;
    public MDIFromGUI(){
        childFrame1.add(new JLabel());
        childFrame1.setSize(200, 150);
        childFrame1.setVisible(true);
        
        childFrame2.add(new JLabel());
        childFrame2.setSize(200, 150);
        childFrame2.setVisible(true);
        
        childFrame3.add(new JLabel());
        childFrame3.setSize(200, 150);
        childFrame3.setVisible(true);
        
        int x2 = childFrame1.getX() + 200;
        int y2 = childFrame1.getY();
        int x3 = childFrame1.getX() + 400;
        int y3 = childFrame1.getY();
        
        childFrame2.setLocation(x2, y2);
        childFrame3.setLocation(x3, y3);
        
        dp.add(childFrame1);
        dp.add(childFrame2);
        dp.add(childFrame3);
        
        f.add(dp);
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        
        m4 = new JMenu("New");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        mi4 = new JMenuItem("Window");
        mi5 = new JMenuItem("Message");        m1.add(m4);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m4.add(mi4);
        m4.add(mi5);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setJMenuBar(mb);
        f.pack();
        f.setVisible(true);
    }
}
