package Frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

        MyFrame() { // constructor for MyFrame class (this is a class that extends JFrame)
            ImageIcon image = new ImageIcon("logo.png"); // create an ImageIcon

            this.setTitle("Frames Demo"); // title of the window
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
            this.setResizable(false); // prevent frame from being resized
            this.setSize(420, 420); // width, height in pixels
            this.setIconImage(image.getImage()); // change icon of frame
            this.setLayout(null); // set layout of frame (default is BorderLayout)
            this.getContentPane().setBackground(new Color(18, 52, 60)); // change color of background


        }

}
