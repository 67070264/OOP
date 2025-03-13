package week13;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class TimerClock extends JLabel implements Runnable, MouseListener {
    int sec = 0;
    int min = 0;
    int hour = 0;
    boolean counter = true; 

    public TimerClock() {
        Font f = new Font("SansSerif", Font.BOLD, 50);
        setFont(f);
        setForeground(Color.BLACK);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        setText("00:00:00");

        this.addMouseListener(this);
    }

    @Override
    public void run() {
        while (true) { 
            if (counter) {
                sec++;
                if (sec == 60) {
                    sec = 0;
                    min++;
                    if (min == 60) {
                        min = 0;
                        hour++;
                    }
                }
                setText(String.format("%02d:%02d:%02d", hour, min, sec));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        counter = !counter; 
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
