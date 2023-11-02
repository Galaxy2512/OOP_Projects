package Labels;

//JLabel = a GUI display area for a string of text, an image, or both
//          can be created using the following constructors:
//          JLabel()
//          JLabel(String text)
//          JLabel(Icon image)
//          JLabel(String text, Icon image, int horizontalAlignment)
//          JLabel(String text, int horizontalAlignment)

import javax.swing.*;
import java.awt.*;

//Jlabel = a GUI display area for a string of text, an image, or both
//          can be created using the following constructors:
//          JLabel()
//          JLabel(String text)
//          JLabel(Icon image)
public class Main {
    public static void main(String[] args) {

        JLabel label = new JLabel(); // create a JLabel
        ImageIcon image = new ImageIcon("dude.png"); // create an ImageIcon
        label.setText("Bro, do you even code?"); // set text of label
        label.setIcon(image); // set icon of label
        label.setIconTextGap(10); // set gap of text to image
        label.setForeground(new Color(0x4A6C95)); // set text color
        label.setFont(new Font("MV Boli", Font.PLAIN, 100)); // set font of text

        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
        label.setBounds(0, 0, 500, 500); // set x and y positions within frame as well as dimensions
        label.setVisible(true);






        JFrame frame = new JFrame(); // create an instance of MyFrame class
        frame.setVisible(true); // show the frame
        frame.setSize(420, 420); // width, height in pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setTitle("JLabel Demo"); // title of the window


    }
}
