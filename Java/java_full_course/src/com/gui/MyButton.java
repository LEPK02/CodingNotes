package com.gui;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyButton extends JFrame implements ActionListener {
    
    JButton button; // make <button> global so that other methods can access it
    JLabel label;

    MyButton () {
        
        // Load images
        ImageIcon bayernLogo = new ImageIcon("bayern-logo.png");
        ImageIcon bayernHome1718 = new ImageIcon("bayern-home-jersey-17-18.png");


        // Create JLabel of 17-18 home kit
        label = new JLabel();

        label.setIcon(resizeImageIcon(bayernHome1718, 150, 150));

        label.setBounds(175, 200, 150, 150);
        label.setVisible(false);


        // JButton
        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this); // set button action
        button.setEnabled(true); // enable/disable the button; place this line in addActionListener to disable the button after one click

        // Text settings
        button.setText("17-18 Home Kit"); // set button label
        button.setFocusable(false); // remove border around text label
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 12));
        button.setIconTextGap(3);
        button.setForeground(Color.decode("#D2D2CF"));

        // Background and border settings
        button.setBackground(Color.decode("#333"));
        button.setBorder(BorderFactory.createEtchedBorder());

        // Button image label settings
        ImageIcon bayernLogoButton = resizeImageIcon(bayernLogo, 20, 20); // resize image
        button.setIcon(bayernLogoButton); // set image label of button


        // Frame title
        this.setTitle("Bayern");
        this.setIconImage(bayernLogo.getImage());
        
        this.getContentPane().setBackground(Color.decode("#D2D2CF"));

        // Frame settings
        this.setSize(500, 500);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // Add to frame
        this.add(button);
        this.add(label);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button) {
            // System.out.println("Mia San Mia");
            if (!label.isVisible()) {
                label.setVisible(true);
            } else {
                label.setVisible(false);
            }
        }
    }

    public ImageIcon resizeImageIcon (ImageIcon i, int newWidth, int newHeight) {
        Image image = i.getImage();
        Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
        return new ImageIcon(scaledImage);
    }
}
