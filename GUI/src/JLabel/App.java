package JLabel;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500); // width, height in pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized

        ImageIcon image = new ImageIcon("slika.png"); // create an ImageIcon

        frame.setTitle("Hi friends"); // title of the window
        frame.setVisible(true); // make frame visible



    }



}
