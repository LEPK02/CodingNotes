package com.gui;

import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args) {
        /* Basic GUI */
        // String name = JOptionPane.showInputDialog("Enter your name:");
        // JOptionPane.showMessageDialog(null, "Hello " + name);

        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        // JOptionPane.showMessageDialog(null, "You are " + age + " years old");


        /* JFrame
        A GUI window to add components to */
        /* Manually set frame */
        // JFrame frame = new JFrame(); // creates a frame

        // frame.setTitle("Hello!"); // sets frame title
        // frame.setSize(180,180); // sets x and y dimensions of the frame
        // frame.setResizable(true); // default true
        
        // frame.setVisible(true); // makes frame visible
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the application; default is HIDE_ON_CLOSE; one option is DO_NOTHING_ON_CLOSE

        // ImageIcon image = new ImageIcon("bayern-logo.png"); // creates ImageIcon
        // frame.setIconImage(image.getImage()); // change frame's icon
        // frame.getContentPane().setBackground(Color.decode("#D2D2CF")); // use <new Color(x, y, z)> for RGB

        /* Use custom frame template - subclass of JFrame */
        // MyFrame frame = new MyFrame();


        /* JLabel
        A GUI display area for a string of text, an image, or both */
        // // Create label
        // JLabel label = new JLabel();
        
        // label.setText("FC Bayern Munich"); // add text
        
        // ImageIcon image = new ImageIcon("bayern-logo.png");
        // label.setIcon(image); // add image to label

        // label.setHorizontalTextPosition(JLabel.CENTER); // set horizontal position of ImageIcon: LEFT, CENTER, RIGHT
        // label.setVerticalTextPosition(JLabel.BOTTOM); // set vertical position of ImageIcon: TOP, CENTER, BOTTOM
        // label.setForeground(Color.gray); // set text colour
        // label.setFont(new Font("Arial", Font.BOLD, 30));
        // label.setIconTextGap(10); // set distance between text and image labels
        // label.setBackground(Color.black); // set label background colour
        // label.setOpaque(true); // shows label background colour
        // Border border = BorderFactory.createLineBorder(Color.blue, 5);
        // label.setBorder(border);
        // label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label: TOP, CENTER, BOTTOM
        // label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label: TOP, CENTER, BOTTOM
        // // label.setBounds(0, 0, 400, 400); // x, y, width, height; incompatible with frame.pack()

        // // Create frame
        // JFrame frame = new JFrame();
        
        // frame.setTitle("Bayern");
        // // frame.setSize(690, 690); // will be overridden by frame.pack()
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setIconImage(image.getImage());
        // // frame.setLayout(null); // incompatible with frame.pack()


        // // Add elements to frame
        // frame.add(label);
        // frame.pack(); // frame adjusts size to fit just the added components
        // frame.setVisible(true);


        /* JPanel
        A GUI component that functions as a container to hold other components */
        // Create labels
        // ImageIcon icon = new ImageIcon("play-icon.png");

        // JLabel label = new JLabel();
        // label.setText("Play");
        // label.setIcon(icon);

        // label.setHorizontalTextPosition(JLabel.CENTER);
        // label.setVerticalTextPosition(JLabel.BOTTOM);
        // // label.setVerticalAlignment(JLabel.TOP); // incompatible with setBounds
        // // label.setHorizontalAlignment(JLabel.CENTER); 
        // // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(225, 100, 75, 75); // incompatible with setVerticalAlignment or setHorizontalAligment

        // // Create panels
        // JPanel redPanel = new JPanel();
        // redPanel.setBackground(Color.red);
        // redPanel.setBounds(0, 0, 250, 250); // x, y, width, height
        // redPanel.setLayout(null); // set to <new BorderLayout()> if not using label.setBounds()

        // JPanel bluePanel = new JPanel();
        // bluePanel.setBackground(Color.blue);
        // bluePanel.setBounds(250, 0, 250, 250);
        // bluePanel.setLayout(null);

        // JPanel whitePanel = new JPanel();
        // whitePanel.setBackground(Color.white);
        // whitePanel.setBounds(0, 250, 500, 250);
        // whitePanel.setLayout(null);

        // // Create frame
        // JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        // frame.setSize(750, 750);
        // frame.getContentPane().setBackground(Color.decode("#D2D2CF"));

        // // Add elements to panel
        // whitePanel.add(label);

        // // Add elements to frame
        // frame.add(redPanel);
        // frame.add(bluePanel);
        // frame.add(whitePanel);
        
        // frame.setVisible(true);


        /* JButton
        A button that performs an action when clicked on */
        // MyButton frame = new MyButton();


        /* BorderLayout
        Places components in five areas: NORTH, SOUTH, EAST, WEST, and CENTER, with all extra space being placed in the center area */
        // MyFrame frame = new MyFrame();
        // frame.setLayout(new BorderLayout(10, 5)); // width, height

        // JPanel panelNorth = new JPanel();
        // JPanel panelWest = new JPanel();
        // JPanel panelEast = new JPanel();
        // JPanel panelSouth = new JPanel();
        // JPanel panelCenter = new JPanel();

        // panelNorth.setBackground(Color.red);
        // panelWest.setBackground(Color.green);
        // panelEast.setBackground(Color.yellow);
        // panelSouth.setBackground(Color.blue);
        // panelCenter.setBackground(Color.magenta);

        // panelNorth.setPreferredSize(new Dimension(100, 100));
        // panelWest.setPreferredSize(new Dimension(100, 100));
        // panelEast.setPreferredSize(new Dimension(100, 100));
        // panelSouth.setPreferredSize(new Dimension(100, 100));
        // panelCenter.setPreferredSize(new Dimension(100, 100));

        // // Sub-panels
        // panelCenter.setLayout(new BorderLayout());

        // JPanel panelCenterNorth = new JPanel();
        // JPanel panelCenterSouth = new JPanel();

        // panelCenterNorth.setBackground(Color.black);
        // panelCenterSouth.setBackground(Color.white);

        // panelCenterNorth.setPreferredSize(new Dimension(50, 50));
        // panelCenterSouth.setPreferredSize(new Dimension(50, 50));

        // panelCenter.add(panelCenterNorth, BorderLayout.NORTH);
        // panelCenter.add(panelCenterSouth, BorderLayout.SOUTH);

        // // Add panels to frame
        // frame.add(panelNorth, BorderLayout.NORTH);
        // frame.add(panelWest, BorderLayout.WEST);
        // frame.add(panelEast, BorderLayout.EAST);
        // frame.add(panelSouth, BorderLayout.SOUTH);
        // frame.add(panelCenter, BorderLayout.CENTER);


        /* FlowLayout
        Layout Manager: defines the natural layout for components within a container
        
        FlowLayout: places components in a row in their preferred size
        If the horizontal space in the container is too small, the FlowLayout class uses the next available row */
        // // Create frame
        // JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // frame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); // CENTER (default) = centered, LEADING = left-justified, TRAILING = right-justified; horizontal spacing; vertical spacing

        // // Create panel
        // JPanel panel = new JPanel();
        // panel.setPreferredSize(new Dimension(250, 250));
        // panel.setBackground(Color.lightGray);
        // panel.setLayout(new FlowLayout());

        // // Add items to frame
        // panel.add(new JButton("1"));
        // panel.add(new JButton("2"));
        // panel.add(new JButton("3"));
        // panel.add(new JButton("4"));
        // panel.add(new JButton("5"));
        // panel.add(new JButton("6"));
        // panel.add(new JButton("7"));
        // panel.add(new JButton("8"));
        // panel.add(new JButton("9"));

        // frame.add(panel);

        // frame.setVisible(true);


        /* GridLayout
        GridLayout: places components in a grid of cells, where each component takes all available space within its cell and each cell is the same size */
        // // Create frame
        // JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // frame.setLayout(new GridLayout(3, 3)); // no. of rows, no. of columns, horizontal margin, vertical margin

        // // Add items to frame
        // frame.add(new JButton("1"));
        // frame.add(new JButton("2"));
        // frame.add(new JButton("3"));
        // frame.add(new JButton("4"));
        // frame.add(new JButton("5"));
        // frame.add(new JButton("6"));
        // frame.add(new JButton("7"));
        // frame.add(new JButton("8"));
        // frame.add(new JButton("9"));

        // frame.setVisible(true);


        /* JLayeredPane
        Swing container that provides a thrid dimension for positioning components (e.g. depth, Z-index)
        Layers in ascending depth: Default, Palette, Modal, PopUp, Drag */
        // Create labels
        // JLabel label1 = new JLabel();
        // label1.setOpaque(true);
        // label1.setBackground(Color.RED);
        // label1.setBounds(50, 50, 200, 200);

        // JLabel label2 = new JLabel();
        // label2.setOpaque(true);
        // label2.setBackground(Color.GREEN);
        // label2.setBounds(100, 100, 200, 200);

        // JLabel label3 = new JLabel();
        // label3.setOpaque(true);
        // label3.setBackground(Color.BLUE);
        // label3.setBounds(150, 150, 200, 200);

        // // Create JLayeredPane
        // JLayeredPane layeredPane = new JLayeredPane();
        // layeredPane.setBounds(0, 0, 500, 500);

        // // Create frame
        // JFrame frame = new JFrame("JLayeredPane");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(new Dimension(500, 500));
        // frame.setLayout(null);

        // // Add to frame
        // frame.add(layeredPane);

        // layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        // layeredPane.add(label2, Integer.valueOf(0));
        // layeredPane.add(label3, JLayeredPane.MODAL_LAYER);
        
        // frame.setVisible(true);


        /* New Window */
        // LaunchPage launchPage = new LaunchPage();


        /* JOptionPane
        Creates a standard dialog box */
        // // Message types
        // JOptionPane.showMessageDialog(null, "Hello World!", "Title", JOptionPane.PLAIN_MESSAGE); // arguments: <parent component, message, title, messageType>
        // JOptionPane.showMessageDialog(null, "Information", "Title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "How are you?", "Title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "WARNING", "Title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "404 NOT FOUND", "Title", JOptionPane.ERROR_MESSAGE);

        // // Options
        // int answer = JOptionPane.showConfirmDialog(null, "Hello World!", "Title", JOptionPane.YES_NO_CANCEL_OPTION);  // arguments: <parent component, message, title, optionType>
        // System.out.println(answer);

        // // Taking input
        // String name = JOptionPane.showInputDialog("What is your name?");
        // System.out.println(name);

        // // Options with image
        // ImageIcon icon = new ImageIcon("bayern-logo.png");
        // Image image = icon.getImage();
        // Image newimg = image.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        // icon = new ImageIcon(newimg);

        // String options[] = {"Please", "Thank you", "Sorry"};

        // JOptionPane.showOptionDialog(
        //     null,
        //     "Hello world!",
        //     "Title",
        //     JOptionPane.YES_NO_CANCEL_OPTION,
        //     JOptionPane.INFORMATION_MESSAGE,
        //     icon,
        //     options,
        //     0); // arguments: <parent component, message, title, optionType, messageType, icon, options, initialValue>


        /* JTextField
        GUI textbox component used to add, set or get text */
        // TextFrame frame = new TextFrame();


        /* JCheckBox
        GUI component that can be selected or deselected */
        // CheckboxFrame checkbox = new CheckboxFrame();


        /* JRadioButton
        One or more buttons in a group, in which only one may be selected per group*/
        // RadioFrame radioFrame = new RadioFrame();


        /* JComboBox
        A component that combines a button/editable field and a dropdown list */
        // ComboBoxFrame comboBoxFrame = new ComboBoxFrame();


        /* JSlider */
        // Slider slider = new Slider();


        /* Progress bar */
        // ProgressBar bar = new ProgressBar();
        

        /* Menu bar */
        // MenuBar bar = new MenuBar();


        /* Selecting files */
        // SelectFile chooseFile = new SelectFile();


        /* Colour picker */
        // ColourPicker colourPicker = new ColourPicker();


        /* KeyListener */
        // KeyListenerDemo keyListener = new KeyListenerDemo();


        /* MouseListener */
        // MouseListenerDemo mouseListener = new MouseListenerDemo();


        /* Drag and drop */
        // DragDrop dragAndDrop = new DragDrop();


        /* Key bindings 
        Bind an action to a keystroke
        Does not require you to click a component to give it focus
        All Swing components are capable of key bindings; can assign key strokes to individual Swing components*/
        // KeyBindingDemo keyBindingDemo = new KeyBindingDemo();


        /* 2D Graphics */
        // Graphics2D graphic2D = new Graphics2D();


        /* Animation */
        // AnimationFrame animationFrame = new AnimationFrame();
    }
}
