package com.study.chapter6.InnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * This program demonstrates the use of inner classes.
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        //keep program running until use selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock{
    private int interval;
    private boolean beep;

    /**
     * Constructs a talking clock
     * @param interval the interval between message (i milliseconds)
     * @param beep true if the clock should beep
     */
    public TalkingClock(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * starts the clock
     */
    public void start(){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval,listener);
        t.start();
    }

    public class TimePrinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone, the time is " + new Date());
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}