package com.gui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class SelectFile extends JFrame implements ActionListener {

	JButton openButton;
	JButton saveButton;

    SelectFile () {

    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        openButton = new JButton("Open File");
        openButton.addActionListener(this);

        saveButton = new JButton("Save File");
        saveButton.addActionListener(this);

        this.add(openButton);
        this.add(saveButton);
    	this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {

    	if (e.getSource() == openButton) {

    		JFileChooser fileChooser = new JFileChooser();
    		fileChooser.setCurrentDirectory(new File("C:\\"));

    		int response = fileChooser.showOpenDialog(null); // select file to open

    		if (response == JFileChooser.APPROVE_OPTION) {
    			File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
    			System.out.println(file);
    		}
    	} else if (e.getSource() == saveButton) {

    		JFileChooser fileChooser = new JFileChooser();
    		fileChooser.setCurrentDirectory(new File("C:\\"));

    		int response = fileChooser.showSaveDialog(null); // select file to save

    		if (response == JFileChooser.APPROVE_OPTION) {
    			File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
    			System.out.println(file);

    		} else {
    			return;
    		}
    	}
    }
}
