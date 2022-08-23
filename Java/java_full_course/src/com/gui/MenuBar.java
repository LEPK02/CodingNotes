package com.gui;

import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class MenuBar extends JFrame implements ActionListener {

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenuItem openItem;
	JMenuItem saveItem;
	JMenuItem exitItem;

    MenuBar () {

    	// Create frame
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        // Create menu bar
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);

		// Create file option
		fileMenu = new JMenu("File");
		ImageIcon folderIcon = new ImageIcon("folder.png");
		fileMenu.setIcon(folderIcon);

		openItem = new JMenuItem("Open");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");

		openItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);

		ImageIcon saveIcon = new ImageIcon("diskette.png");
		saveItem.setIcon(saveIcon);

		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");

		// Set keyboard shortcuts
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H
		openItem.setMnemonic(KeyEvent.VK_L); // L
		saveItem.setMnemonic(KeyEvent.VK_S); // S
		exitItem.setMnemonic(KeyEvent.VK_E); // E

		// Add options to menus
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

    	menuBar.add(fileMenu);
    	menuBar.add(editMenu);
    	menuBar.add(helpMenu);

    	this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {

    	if (e.getSource() == openItem) {
    		System.out.println("File opened");
    	} else if (e.getSource() == saveItem) {
    		System.out.println("File saved");
    	} else {
    		System.exit(0);
    	}
    }
}
