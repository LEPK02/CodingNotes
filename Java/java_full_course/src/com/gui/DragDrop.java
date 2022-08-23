package com.gui;

import javax.swing.JFrame;

public class DragDrop extends JFrame {

    DragPanel dragPanel = new DragPanel();

    DragDrop () {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setTitle("Drag & Drop");

        this.add(dragPanel);
        this.setVisible(true);
    }
}
