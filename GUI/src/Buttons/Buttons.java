package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JFrame implements ActionListener {

    JButton button; // create a button
    Buttons() {

        ImageIcon icon = new ImageIcon("point.png"); // create an ImageIcon

        button = new JButton(); // create a button
        button.setBounds(100, 100, 150, 100); // x, y, width, height
        button.addActionListener(e -> System.out.println("You clicked the button")); // add an action listener (when button is clicked, do something), this is example of lambda expression
        button.setText("I'm a button"); // set button text
        button.setFocusable(false); // get rid of focus around button text
        button.setIcon(icon); // set icon
        button.setHorizontalTextPosition(JButton.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        button.setVerticalTextPosition(JButton.BOTTOM); // set text TOP, CENTER, BOTTOM of imageicon
        button.setFont(new java.awt.Font("Comic Sans", java.awt.Font.BOLD, 25)); // set font of text
        button.setIconTextGap(-15); // set gap of text to image
        button.setForeground(Color.cyan); // set color of text
        button.setBackground(Color.lightGray); // set background color of button
        button.setBorder(BorderFactory.createEtchedBorder()); // set border of button
        button.setEnabled(true); // set button enabled or disabled



        this.setTitle("Buttons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setSize(500, 500); // width, height in pixels
        this.setVisible(true); // make frame visible (this should be the last line)
        this.add(button); // add button to frame
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
