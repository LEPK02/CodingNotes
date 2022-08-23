package com.gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {
    
    MyFrame() {
        
        this.setTitle("Hello!"); // sets frame title
        this.setSize(500, 500); // sets x and y dimensions of the frame
        this.setResizable(true); // default true
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the application; default is HIDE_ON_CLOSE; one option is DO_NOTHING_ON_CLOSE

        ImageIcon image = new ImageIcon("bayern-logo.png"); // creates ImageIcon
        this.setIconImage(image.getImage()); // change frame's icon
        this.getContentPane().setBackground(Color.decode("#D2D2CF")); // use <new Color(x, y, z)> for RGB
        
        this.setVisible(true); // makes frame visible
    }
}
