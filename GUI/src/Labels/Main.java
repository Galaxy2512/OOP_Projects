package Labels;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.*;

//Jlabel = a GUI display area for a string of text, an image, or both

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("dude.png"); // create an ImageIcon
        JLabel label = new JLabel(); // create a JLabel
        Border border = BorderFactory.createLineBorder(Color.black, 5); // create a border for the label
        label.setBorder(border); // set border for label


        label.setText("Dude, do you even code?"); // set text of label
        label.setIcon(image); // set icon of label
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0xFF12D021, true)); // set font color of text
        label.setFont(new Font("Calibri", Font.BOLD, 20)); // set font of text
        label.setIconTextGap(-25); // set gap of text to image (negative to bring closer) (default is 4)
        label.setBackground(Color.green); // set background color of label
        label.setOpaque(true); // display background color
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label









        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
        label.setBounds(0, 0, 500, 500); // set x and y positions within frame as well as dimensions
        label.setVisible(true);






        JFrame frame = new JFrame(); // create an instance of MyFrame class
        frame.setVisible(true); // show the frame
        frame.setSize(420, 420); // width, height in pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setTitle("Dude Jlabel is fun"); // title of the window
        frame.add(label); // add label to frame
        //how to make gui resizable
        frame.setResizable(true);


    }
}
