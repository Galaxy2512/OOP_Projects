package FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setTitle("FlowLayout Demo"); // title of the window
        frame.setSize(500, 500); // width, height in pixels
        frame.setLayout(new java.awt.FlowLayout(FlowLayout.CENTER,10,10)); //Layout manager (FlowLayout, BorderLayout, GridLayout) (margin between components) (FlowLayout.CENTER, FlowLayout.LEFT, FlowLayout.RIGHT, FlowLayout.LEADING, FlowLayout.TRAILING)
//FlowLayout.CENTER means that the components will be centered
//FlowLayout.LEFT means that the components will be aligned to the left
//FlowLayout.RIGHT means that the components will be aligned to the right
//FlowLayout.LEADING means that the components will be aligned to the left if the language is left to right and to the right if the language is right to left
//FlowLayout.TRAILING means that the components will be aligned to the right if the language is left to right and to the left if the language is right to left



        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");






        frame.add(panel);





        frame.setVisible(true); // make frame visible (this should be the last line)

    }
}
