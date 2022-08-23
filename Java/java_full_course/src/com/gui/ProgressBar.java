package com.gui;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class ProgressBar {

	JFrame frame;
	JProgressBar progressBar;

    ProgressBar () {
        
        frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(420, 420);

    	UIManager.put("ProgressBar.selectionBackground", Color.BLACK); // set font colour of text when not covered by bar
		UIManager.put("ProgressBar.selectionForeground", Color.WHITE); // set font colour of text when covered by bar
    	
		progressBar = new JProgressBar();
    	progressBar.setValue(0);
    	progressBar.setBounds(0, 0, 400, 50); // arguments: <x, y, width, height>
    	progressBar.setStringPainted(true); // adds percentage labels
    	progressBar.setFont(new Font("Comic Sans", Font.BOLD, 20));
    	progressBar.setForeground(Color.GREEN); // set fill colour
    	progressBar.setBackground(Color.GRAY); // set bar background colour

    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    	frame.add(progressBar);

        load();
    }

    public void load () {

    	int counter = 0;

    	while (counter <= 100) {
    		progressBar.setValue(counter);

    		try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}

    		counter += 1;
    	}

    	progressBar.setString("Done!");
    }
}
