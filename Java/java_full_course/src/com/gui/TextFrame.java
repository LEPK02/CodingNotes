package com.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class TextFrame extends JFrame implements ActionListener {
    
	JButton button;
	JTextField textField;

    TextFrame () {

    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JLabel label = new JLabel("What is your name?");

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("your name here");

        this.add(label);
        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
    	if (e.getSource() == button) {
    		System.out.println("Welcome " + textField.getText());
    		button.setEnabled(false);
    		textField.setEditable(false); // prevents user from editing text in text field
    	}
    }
}
