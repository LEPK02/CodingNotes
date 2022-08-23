package com.gui;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class MouseListenerDemo extends JFrame implements MouseListener {

    JLabel label;
    JLabel legend;
    JLabel pizzaLabel;
    ImageIcon pizzaIcon;
    JLabel potatoLabel;
    ImageIcon potatoIcon;

    MouseListenerDemo () {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.GRAY);
        label.setOpaque(true);
        label.addMouseListener(this);

        legend = new JLabel();
        legend.setText("<html>Click: potato<br>Press: blue<br>Release: red<br>Enter: popup<br>Exit: disappear</html>");
        legend.setBounds(350, 0, 100, 100);
        legend.setOpaque(false);

        pizzaLabel = new JLabel();
        pizzaIcon = new ImageIcon("pizza.png");
        pizzaLabel.setIcon(pizzaIcon);
        pizzaLabel.setVisible(false);
        pizzaLabel.setBounds(200, 0, 100, 100);

        potatoLabel = new JLabel();
        potatoIcon = new ImageIcon("potato.png");
        potatoLabel.setIcon(potatoIcon);
        potatoLabel.setVisible(false);
        potatoLabel.setBounds(200, 30, 100, 100);

        this.add(label);
        this.add(legend);
        this.add(pizzaLabel);
        this.add(potatoLabel);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked (MouseEvent e) {
        // Invoked when a mouse button has been clicked (pressed and released) on a component
        if (potatoLabel.isVisible()) {
            potatoLabel.setVisible(false);
        } else {
            potatoLabel.setVisible(true);
        }
    }

    @Override
    public void mousePressed (MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased (MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        label.setBackground(Color.RED);
    }

    @Override
    public void mouseEntered (MouseEvent e) {
        // Invoked when a mouse button enters the area of a component
        pizzaLabel.setVisible(true);
    }

    @Override
    public void mouseExited (MouseEvent e) {
        // Invoked when a mouse button exits a component
        pizzaLabel.setVisible(false);
    }
}
