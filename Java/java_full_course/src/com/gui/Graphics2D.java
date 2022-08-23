package com.gui;

import javax.swing.JFrame;

public class Graphics2D extends JFrame {

    Graphics2DPanel panel;
    
    Graphics2D () {

        panel = new Graphics2DPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
