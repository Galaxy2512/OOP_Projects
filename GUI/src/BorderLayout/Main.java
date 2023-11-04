package BorderLayout;

// BorderLayout is a layout manager that arranges components in five regions: north, south, east, west, and center.
// Each region (area) may contain no more than one component, and is identified by a corresponding constant:
// NORTH, SOUTH, EAST, WEST, and CENTER. When adding a component to a container with a border layout,
// use one of these five constants, for example:
//     panel.add(new JButton("Click Me"), BorderLayout.NORTH);

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();





        //Subpanels

        panel.setBackground(Color.cyan);
        panel.setPreferredSize(new Dimension(100, 50));
        panel2.setBackground(Color.red);
        panel2.setPreferredSize(new Dimension(100, 50));
        panel3.setBackground(Color.blue);
        panel3.setPreferredSize(new Dimension(100, 50));
        panel4.setBackground(Color.yellow);
        panel4.setPreferredSize(new Dimension(100, 50));
        panel5.setBackground(Color.magenta);
        panel5.setPreferredSize(new Dimension(250, 250));


        panel6.setBackground(Color.cyan);
        panel6.setPreferredSize(new Dimension(50, 10));
        panel7.setBackground(Color.darkGray);
        panel7.setPreferredSize(new Dimension(50, 10));
        panel8.setBackground(Color.green);
        panel8.setPreferredSize(new Dimension(50, 10));
        panel9.setBackground(Color.black);
        panel9.setPreferredSize(new Dimension(50, 10));
        panel10.setBackground(Color.white);
        panel10.setPreferredSize(new Dimension(50, 50));

        panel.add(panel6, BorderLayout.NORTH); // add label to panel (panel is invisible by default)
        panel2.add(panel7, BorderLayout.SOUTH);
        panel3.add(panel8, BorderLayout.EAST);
        panel4.add(panel9, BorderLayout.WEST);
        panel5.add(panel10, BorderLayout.CENTER);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setTitle("BorderLayout Demo"); // title of the window
        frame.setSize(500, 500); // width, height in pixels
        frame.setLayout(new BorderLayout()); //margin between components
        frame.setVisible(true); // make frame visible (this should be the last line)

        frame.add(panel, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);




    }
}
