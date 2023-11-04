package GridLayout;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setTitle("GridLayout Demo"); // title of the window
        frame.setSize(500, 500); // width, height in pixels

        frame.setLayout(new java.awt.GridLayout(3,3,10,10));
        //Layout manager (FlowLayout, BorderLayout, GridLayout) (margin between components) (FlowLayout.CENTER, FlowLayout.LEFT, FlowLayout.RIGHT, FlowLayout.LEADING, FlowLayout.TRAILING)

        frame.add(new JButton("1")); //shotcut for frame.getContentPane().add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));













        frame.setVisible(true); // make frame visible (this should be the last line
    }

}
