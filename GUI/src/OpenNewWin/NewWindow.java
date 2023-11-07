package OpenNewWin;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();



    JLabel label = new JLabel("Hello");


public NewWindow() {

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setSize(420, 420);
    frame.setLayout(null);
    frame.add(label);


    label.setBounds(0, 0, 100, 50);
    label.setBackground(Color.gray);
    label.setOpaque(true); // display background color of label
    label.setFont(new Font("MV Boli", Font.PLAIN, 20));




    frame.setVisible(true);


    }


}
