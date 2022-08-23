package com.gui;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener {
    
	JFrame frame;
	JLabel label;
	JPanel panel;
	JSlider slider;

	Slider () {

		frame = new JFrame("Slider");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		
		slider = new JSlider(0, 100, 25); // min, max, start
		slider.setPreferredSize(new Dimension(400, 200));
		slider.setFont(new Font("Comic Sans", Font.PLAIN, 15));
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setPaintTicks(true); // show minor ticks
		slider.setMinorTickSpacing(10); // set smaller slider markings
		slider.setPaintTrack(true); // show major ticks
		slider.setMajorTickSpacing(25); // set larger slider markings
		slider.setPaintLabels(true); // show major tick labels
		slider.addChangeListener(this);

		label = new JLabel();
		label.setText(slider.getValue() + "\u00B0C");

		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420, 420);
		frame.setVisible(true);
	}

    @Override
    public void stateChanged (ChangeEvent e) {
    	label.setText(slider.getValue() + "\u00B0C");
    }
}
