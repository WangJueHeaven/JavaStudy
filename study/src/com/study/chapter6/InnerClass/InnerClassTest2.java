package com.study.chapter6.InnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class InnerClassTest2 {
    public static void main(String[] args) {
        TalkingClock2 talkingClock2 = new TalkingClock2(1000,true);
        talkingClock2.start();

        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}

class TalkingClock2{
    private int interval;
    private boolean beep;

    TalkingClock2(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    void start(){
        ActionListener listener = this.new TimePrinter();
        Timer timer = new Timer(interval,listener);
        timer.start();
    }

    private class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone, the time is "+new Date());
            if(TalkingClock2.this.beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
