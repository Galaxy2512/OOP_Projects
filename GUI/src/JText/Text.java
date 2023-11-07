package JText;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame implements ActionListener {

    JTextField textField = new JTextField();
    JButton button = new JButton("Submit");

    Text() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);

        button.setBounds(100, 200, 200, 50);
        button.addActionListener(this);

        textField.setPreferredSize(new Dimension(250, 40)); // set size of text field (width, height)   (height is optional)
        textField.setFont(new Font("Consolas", Font.PLAIN, 35)); // set font of text
        textField.setForeground(Color.green); // set font color of text
        textField.setBackground(Color.black); // set background color of text field
        textField.setCaretColor(Color.white); // set caret/cursor color of text field
        textField.setText("username"); // set text of text field
        //textField.setEditable(true); // set text field to be editable (true by default)


        //textField.setEditable(false); // set text field to be editable (true by default)
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button) {
            System.out.println("Welcome " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);

        }
    }
}
