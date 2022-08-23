package com.gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class CheckboxFrame extends JFrame implements ActionListener {
    
	JButton button;
	JCheckBox checkbox;
	ImageIcon playIcon;
	ImageIcon stopIcon;

    CheckboxFrame () {

    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        playIcon = new ImageIcon("play-icon.png");
        stopIcon = new ImageIcon("Stop.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

    	checkbox = new JCheckBox();
    	checkbox.setText("Play/Stop");
    	checkbox.setFocusable(false);
    	checkbox.setFont(new Font("Comic Sans", Font.PLAIN, 20));
    	checkbox.setIcon(stopIcon);
    	checkbox.setSelectedIcon(playIcon);

    	this.add(checkbox);
    	this.add(button);
    	this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
    	if (e.getSource() == button) {
    		if (checkbox.isSelected()) {
    			System.out.println("Playing");
    		} else {
    			System.out.println("Stopped");
    		}
    	}
    }
}
