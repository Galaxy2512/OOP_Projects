package JOptionPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOption implements ActionListener {

    JOption() {

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");



        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);
        //--------------------------------------
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Hello my friend, how are you today?" );


//        JOptionPane.showMessageDialog(null, "Hello my friend, how are you today?", "Title", JOptionPane.WARNING_MESSAGE);
//        String name = JOptionPane.showInputDialog(null, "What is your name?", "Title", JOptionPane.QUESTION_MESSAGE);
//        System.out.println("Hello " + name);
//        JOptionPane.showConfirmDialog(null, "Do you like pizza?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
//        System.out.println("Hello " + name + " you like pizza?");

        String[] responses = {"No, you are awesome", "Thank you!", "*blush*"};
        ImageIcon icon = new ImageIcon("dude.png");
        JOptionPane.showOptionDialog(null, "You are awesome!", "Secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);

    }
}
