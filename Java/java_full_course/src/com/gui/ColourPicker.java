package com.gui;

import javax.swing.JColorChooser;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class ColourPicker extends JFrame implements ActionListener {

	JButton button;
	JLabel label;

    ColourPicker () {

    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a colour");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("The quick brown fox jumped over the lazy dog.");
        label.setFont(new Font("Comic Sans", Font.BOLD, 20));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
    	this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {

    	if (e.getSource() == button) {
    		JColorChooser colourChooser = new JColorChooser();
    		Color chosenColour = JColorChooser.showDialog(null, "Pick a colour:", Color.BLACK); // arguments: <component, title, initialColour>

    		label.setForeground(chosenColour);
    		// label.setBackground(chosenColour);
    	}
    }
}
