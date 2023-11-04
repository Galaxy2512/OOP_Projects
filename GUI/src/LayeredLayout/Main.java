package LayeredLayout;

//JLayeredPane is a Swing container that provides a third dimension for positioning components: depth, also known as Z order.

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JLabel label = new JLabel(); // create a JLabel (a GUI component that contains text, images, etc)
        label.setOpaque(true); // allows us to change the background color of the label
        label.setBackground(java.awt.Color.red);
        label.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.white);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(java.awt.Color.blue);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        layeredPane.add(label, Integer.valueOf(0)); // add label to layeredPane at index 0
        layeredPane.add(label2);
        layeredPane.add(label3 ,Integer.valueOf(2));

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setTitle("LayeredPane Demo"); // title of the window
        frame.setSize(new Dimension(500,500)); // width, height in pixels
        frame.setLayout(null); //Layout manager (FlowLayout, BorderLayout, GridLayout) (margin between components) (FlowLayout.CENTER, FlowLayout.LEFT, FlowLayout.RIGHT, FlowLayout.LEADING, FlowLayout.TRAILING)



        frame.setVisible(true);
    }
}
