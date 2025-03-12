package week12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener{
    JFrame jf;
    JPanel jp1, jp2, jp3, jp4;
    JButton deposit, withdraw;
    JLabel lb1, lb2, lb3;
    JTextField tf1, tf2, tf3;
    File file;
    
    public StudentView(){
        jf = new JFrame();
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        file = new File("StudentM.dat");
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        lb1 = new JLabel("ID:");
        lb2 = new JLabel("Name:");
        lb3 = new JLabel("Money:");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField("0");
        tf3.setEditable(false);
        
        withdraw.addActionListener(this);
        deposit.addActionListener(this);
        jf.addWindowListener(this);
        
        jp1.add(lb1, BorderLayout.WEST);
        jp1.add(tf1, BorderLayout.EAST);
        jp1.setLayout(new GridLayout(1,1));
        
        jp2.add(lb2, BorderLayout.WEST);
        jp2.add(tf2, BorderLayout.EAST);
        jp2.setLayout(new GridLayout(1,1));

        jp3.add(lb3, BorderLayout.WEST);
        jp3.add(tf3, BorderLayout.EAST);
        jp3.setLayout(new GridLayout(1,1));
        
        jp4.add(deposit);
        jp4.add(withdraw);
        
        
        jf.setLayout(new GridLayout(4,1));
        jf.add(jp1);
        jf.add(jp2);
        jf.add(jp3);
        jf.add(jp4);
        jf.setVisible(true);
        jf.setSize(300,200);
        loadText();
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(deposit)){
            int num1 = Integer.parseInt(tf3.getText());
            num1 += 100;
            tf3.setText(String.valueOf(num1));
        }
        else if (e.getSource().equals(withdraw)){
        if (e.getSource().equals(withdraw)){
            int num1 = Integer.parseInt(tf3.getText());
            if (num1 >= 100){
                num1 -= 100;
                tf3.setText(String.valueOf(num1));
                }
            else {
                tf3.setText("0");
                }
            }
        }
    }
    
    public void saveText(){
        int id = Integer.parseInt(tf1.getText());
        String name = tf2.getText();
        int money = Integer.parseInt(tf3.getText());
        Student s = new Student(name, id, money);  
        
        try (FileOutputStream fout = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout)){
            oout.writeObject(s);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void loadText(){
        if (!file.exists()){
            return;
        }
        try (FileInputStream fin = new FileInputStream("StudentM.dat");
            ObjectInputStream oin = new ObjectInputStream(fin)){
            Student s = (Student) oin.readObject();
            tf1.setText(String.valueOf(s.getID()));
            tf2.setText(s.getName());
            tf3.setText(String.valueOf(s.getMoney()));
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
    @Override
    public void windowClosed(WindowEvent e) {}
    
    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        saveText();
    }
    @Override
    public void windowIconified(WindowEvent e) { }

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
    public static void main(String[] args) {
        new StudentView();
    }

}
