package com.gui;

import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class ComboBoxFrame extends JFrame implements ActionListener {

	JComboBox<String> comboBox;

    ComboBoxFrame () {

    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "mouse"};
        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);
        comboBox.addItem("chicken"); // adds option to end of list
        comboBox.insertItemAt("pig", 2); // adds item to list at a specific index
        comboBox.setSelectedIndex(1); // sets initial/default option shown to user
        comboBox.removeItem("mouse");
        comboBox.removeItemAt(0);
        // comboBox.removeAllItems();

        // comboBox.setEditable(true); // allows user to input text
        // System.out.println(comboBox.getItemCount()); // prints number of options

    	this.add(comboBox);
    	this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
    	if (e.getSource() == comboBox) {
    		System.out.println(comboBox.getSelectedItem());
    		// System.out.println(comboBox.getSelectedIndex());
    	}
    }
}
