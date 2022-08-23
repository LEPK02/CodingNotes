package com.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.Timer;
import java.awt.Image;
import javax.swing.JPanel;

public class AnimationPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image bayern;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 10;
    int yVelocity = 20;
    int x = 0;
    int y = 0;

    AnimationPanel () {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.GRAY);

        bayern = new ImageIcon("bayern-icon.png").getImage();
        backgroundImage = new ImageIcon("ball.png").getImage();

        timer = new Timer(10, this);
        timer.start();
    }

    public void paint (Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(bayern, x, y, null);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        if (x >= (PANEL_WIDTH - bayern.getWidth(null)) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        if (y >= (PANEL_HEIGHT - bayern.getHeight(null)) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        x += xVelocity;
        y += yVelocity;
        repaint();
    }
}
