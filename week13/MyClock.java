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
import java.util.Calendar;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable{

    @Override
    public void run() {
        while(true){
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            setText(String.format("%02d:%02d:%02d", hour, min, sec));
                
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    public MyClock(){
        Font f = new Font("SansSerif", Font.BOLD, 50);
        setFont(f);
        setForeground(Color.BLACK);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }

}
