package com.gui;

import javax.swing.KeyStroke;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.Action;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class KeyBindingDemo {
    
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    KeyBindingDemo () {

        frame = new JFrame("Key Binding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upArrow");
        label.getActionMap().put("upArrow", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downArrow");
        label.getActionMap().put("downArrow", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftArrow");
        label.getActionMap().put("leftArrow", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightArrow");
        label.getActionMap().put("rightArrow", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed (ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed (ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed (ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed (ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
