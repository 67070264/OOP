/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author User
 */
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class ChatDemo implements ActionListener, WindowListener{
    JFrame jf;
    JPanel jp1, jp2, jp3;
    JTextArea ta;
    JTextField tf;
    JButton submit, reset;
    File file;
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public ChatDemo(){
        jf = new JFrame();
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        ta = new JTextArea(20,45);
        ta.setEditable(false);
        tf = new JTextField(45);
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        file = new File("ChatDemo.dat");
        
        jp1.setLayout(new BorderLayout());
        jp1.add(ta, BorderLayout.CENTER);
        jp1.add(tf, BorderLayout.SOUTH);
        jp2.add(submit);
        jp2.add(reset);
        jp2.setLayout(new FlowLayout());
        
        submit.addActionListener(this);
        reset.addActionListener(this);
        jf.addWindowListener(this);
        
        loadText();
        
        jf.add(jp1, BorderLayout.CENTER);
        jf.add(jp2, BorderLayout.SOUTH);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.pack();
        
    }
    public void loadText(){
        if (file.exists()){
            try (BufferedReader br = new BufferedReader(new FileReader("ChatDemo.dat"))){
            String textLine;    
            while ((textLine = br.readLine()) != null){
                ta.append(textLine + "\n");
            }
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
    
    public void saveText(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ChatDemo.dat"))){
            bw.write(ta.getText());
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(submit)){
            String text = dtf.format(LocalDateTime.now()) + ": " + tf.getText();
            ta.append(text + "\n");
            tf.setText("");
            saveText();
            System.out.println(text);
        }
        else if (e.getSource().equals(reset)){
            ta.setText("");
            try (FileWriter fw = new FileWriter(file, false)){
                fw.write("");
            }
            catch(IOException ex){
                System.out.println(e);
            }
        }
    }
    @Override
    public void windowClosed(WindowEvent e) {
        saveText();
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {}


    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
}
