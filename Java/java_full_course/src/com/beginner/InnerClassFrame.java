package com.beginner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassFrame extends JFrame {
    
    InnerClassFrame() {

        JButton button = new JButton();

        button.setBounds(100, 100, 100, 100);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed (ActionEvent e) {
                System.out.println("Hello!");
            }
        });

        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
}
