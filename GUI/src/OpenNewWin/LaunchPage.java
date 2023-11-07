package OpenNewWin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
    LaunchPage() {

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
        if (actionEvent.getSource() == button) {
            frame.dispose(); // close the current window (frame) when button is clicked (actionEvent)
            NewWindow newWindow = new NewWindow();
        }


    }
}
