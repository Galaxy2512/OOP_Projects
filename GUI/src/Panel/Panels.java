package Panel;

import javax.swing.*;

//panels are like frames but they are inside frames and they are used to organize components
//panels are invisible by default
//hierarchy: frame -> panel -> components

public class Panels {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("dude.png"); // create an ImageIcon

        JLabel label = new JLabel(); // create a JLabel
        label.setText("Hi");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 200, 200);




        JPanel redPanel = new JPanel();
        redPanel.setLayout(null); // if you don't set the layout to null, the label will not show up
        redPanel.setBounds(0, 0, 200, 200);
        redPanel.setBackground(java.awt.Color.gray);
        redPanel.add(label); // add label to panel

        JPanel bluePanel = new JPanel();
        bluePanel.setLayout(null);
        bluePanel.setBounds(0, 200, 200, 200);
        bluePanel.setBackground(java.awt.Color.blue);


        JLabel redLabel = new JLabel();
        redLabel.setText("this is Grey");
        redLabel.setBounds(50, 50, 100, 100);
        redLabel.setForeground(java.awt.Color.white);


        JLabel blueLabel = new JLabel();
        blueLabel.setText("this is Blue");
        blueLabel.setBounds(50, 50, 100, 100);
        blueLabel.setForeground(java.awt.Color.white);




        JFrame frame = new JFrame();
        frame.add(redPanel);
        frame.add(bluePanel);
        redPanel.add(redLabel);
        bluePanel.add(blueLabel);

        frame.setTitle("Panels");
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new java.awt.Color(18, 52, 60));











    }






    }


