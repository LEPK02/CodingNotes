package com.gui;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Graphics2DPanel extends JPanel {
    
    Image image;

    Graphics2DPanel () {

        image = new ImageIcon("play-icon.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint (Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        // Line
        g2D.setPaint(Color.BLUE);
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0, 0, 500, 500);
        
        // Rectangle/square
        g2D.drawRect(0, 0, 100, 100);
        g2D.setPaint(Color.PINK);
        g2D.fillRect(100, 100, 100, 100);

        // Oval/circle
        g2D.setPaint(Color.ORANGE);
        g2D.drawOval(100, 200, 100, 100);
        g2D.setPaint(Color.MAGENTA);
        g2D.fillOval(0, 100, 100, 100);

        // Pokeball
        g2D.setPaint(Color.RED);
        g2D.fillArc(400, 0, 100, 100, 0, 180);

        g2D.setPaint(Color.BLACK);
        g2D.setStroke(new BasicStroke(3));
        g2D.drawArc(400, 0, 100, 100, 0, 180);
        g2D.drawArc(400, 0, 100, 100, 180, 180);

        g2D.drawLine(400, 50, 500, 50);

        g2D.drawOval(439, 39, 22, 22);
        g2D.setPaint(Color.WHITE);
        g2D.fillOval(440, 40, 20, 20);

        // Triangle
        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        g2D.setPaint(Color.YELLOW);
        g2D.drawPolygon(xPoints, yPoints, 3);

        // Text
        g2D.setFont(new Font("Comic Sans", Font.BOLD, 50));
        g2D.setPaint(Color.BLACK);
        g2D.drawString("Hello world!", 50, 50);

        // Load image
        g2D.drawImage(image, 250, 250, null);
    }
}
