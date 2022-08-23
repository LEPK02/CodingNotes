package com.gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class KeyListenerDemo extends JFrame implements KeyListener {

	JLabel label;

    KeyListenerDemo () {

    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setSize(500, 500);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.WHITE);
        
        ImageIcon icon = new ImageIcon("ball.png");
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
        // label.setBackground(Color.GRAY);
        // label.setOpaque(true);

        this.add(label);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped (KeyEvent e) {
    	/* Invoked when a key is typed
    	Uses KeyCode --> produces an int output */
    	switch (e.getKeyChar()) {
    		case 'w':
    			label.setLocation(label.getX(), label.getY() - 10);
    			break;
    		case 'a':
    			label.setLocation(label.getX() - 10, label.getY());
    			break;
    		case 's':
    			label.setLocation(label.getX(), label.getY() + 10);
    			break;
    		case 'd':
    			label.setLocation(label.getX() + 10, label.getY());
    			break;
    	}
    }

    @Override
    public void keyPressed (KeyEvent e) {
    	/* Invoked when a key is pressed down
    	Uses KeyCode --> produces an int output */
    	switch (e.getKeyCode()) {
    		case 38:
    			label.setLocation(label.getX(), label.getY() - 10);
    			break;
    		case 37:
    			label.setLocation(label.getX() - 10, label.getY());
    			break;
    		case 40:
    			label.setLocation(label.getX(), label.getY() + 10);
    			break;
    		case 39:
    			label.setLocation(label.getX() + 10, label.getY());
    			break;
    	}
    }

    @Override
    public void keyReleased (KeyEvent e) {
    	/* Invoked when a button is released */
    	// System.out.println("You released: " + e.getKeyChar() + ", key code: " + e.getKeyCode());
    }
}
