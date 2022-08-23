package com.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class FrameTemplate extends JFrame implements ActionListener {

    FrameTemplate () {

    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
    	this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
    }
}
