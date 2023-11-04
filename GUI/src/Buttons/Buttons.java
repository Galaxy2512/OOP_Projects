package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ActionListener is an interface that has the method actionPerformed
//JFrame is a GUI window to add components to (buttons, textfields, etc.) (can think of it as a blank canvas)

public class Buttons extends JFrame implements ActionListener { // Buttons class extends JFrame and implements ActionListener which has the method actionPerformed

    JButton button; // create a button
    Buttons() {

        ImageIcon icon = new ImageIcon("button.jpg"); // create an ImageIcon

        button = new JButton(); // create a button
        button.setBounds(200, 200, 100, 50); // x, y, width, height

        button.addActionListener(e -> System.out.println("You clicked the button")); // add an action listener (when button is clicked, do something), this is example of lambda expression
        button.setText("I'm a button"); // set button text
        button.setFocusable(false); // get rid of focus around button text
        button.setIcon(icon); // set icon
        button.setHorizontalTextPosition(JButton.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        button.setVerticalTextPosition(JButton.BOTTOM); // set text TOP, CENTER, BOTTOM of imageicon
        button.setFont(new java.awt.Font("Comic Sans", java.awt.Font.BOLD, 10)); // set font of text
        button.setIconTextGap(-25); // set gap of text to image, when it is minus it brings text closer to image
        button.setForeground(Color.black); // set color of text
        button.setBackground(Color.lightGray); // set background color of button
        button.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.DARK_GRAY)); // set border of button
        button.setEnabled(true); // set button enabled or disabled


//this. is optional but it's good practice to use it to make it clear that you're referring to the instance variable button and not a local variable
        this.setTitle("Buttons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setLayout(null); // set layout of frame (default is BorderLayout)
        this.setSize(500, 500); // width, height in pixels
        this.setVisible(true); // make frame visible (this should be the last line)
        this.add(button); // add button to frame
    }

    @Override // this is the method from ActionListener interface that we need to override (this is the method that is called when button is clicked)
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
