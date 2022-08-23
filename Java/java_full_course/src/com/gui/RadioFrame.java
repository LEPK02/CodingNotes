package com.gui;


import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class RadioFrame extends JFrame implements ActionListener {

	JRadioButton pizzaRadioButton;
	JRadioButton pieRadioButton;
	JRadioButton potatoRadioButton;
	ImageIcon pizzaIcon;
	ImageIcon pieIcon;
	ImageIcon potatoIcon;

    RadioFrame () {

    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaRadioButton = new JRadioButton("Pizza");
        pieRadioButton = new JRadioButton("Pie");
        potatoRadioButton = new JRadioButton("Potato");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaRadioButton);
        group.add(pieRadioButton);
        group.add(potatoRadioButton);

        pizzaRadioButton.addActionListener(this);
        pieRadioButton.addActionListener(this);
        potatoRadioButton.addActionListener(this);

        pizzaIcon = new ImageIcon("pizza.png");
        pieIcon = new ImageIcon("pumpkin-pie.png");
        potatoIcon = new ImageIcon("potato.png");
        pizzaRadioButton.setIcon(pizzaIcon);
        pieRadioButton.setIcon(pieIcon);
        potatoRadioButton.setIcon(potatoIcon);

    	this.add(pizzaRadioButton);
    	this.add(pieRadioButton);
    	this.add(potatoRadioButton);
    	this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
    	if (e.getSource() == pizzaRadioButton) {
    		System.out.println("Pizza");
    	} else if (e.getSource() == pieRadioButton) {
    		System.out.println("Pie");
    	} else if (e.getSource() == potatoRadioButton) {
    		System.out.println("Potato");
    	} else {
    		System.out.println("Select an item");
    	}
    }
}
