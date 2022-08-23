package com.gui;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JFrame;
public class NewWindow {
    
    JFrame frame = new JFrame();

    JLabel label = new JLabel("Hello World!");

    NewWindow () {

    	label.setBounds(0, 0, 100, 50);
    	label.setFont(new Font(null, Font.PLAIN, 25));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(420, 420);
    	frame.setLayout(null);

    	frame.add(label);
    	frame.setVisible(true);
    }
}
