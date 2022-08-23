package com.gui;

import java.awt.event.MouseEvent;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel {
    
    ImageIcon icon = new ImageIcon("bayern-icon.png");
    final int WIDTH = icon.getIconWidth();
    final int HEIGHT = icon.getIconHeight();
    Point iconCorner;
    Point previousPoint;

    DragPanel () {

        iconCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent (Graphics g) {

        super.paintComponent(g);
        icon.paintIcon(this, g, (int) iconCorner.getX(), (int) iconCorner.getY()); // arguments: <component, graphic, x, y>
    }

    private class ClickListener extends MouseAdapter {

        public void mousePressed (MouseEvent e) {

            previousPoint = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged (MouseEvent e) {
            Point currentPoint = e.getPoint();

            iconCorner.translate(
                (int) (currentPoint.getX() - previousPoint.getX()),
                (int) (currentPoint.getY() - previousPoint.getY())
            );

            previousPoint = currentPoint;
            repaint();
        }
    }
}
