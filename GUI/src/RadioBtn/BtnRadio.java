package RadioBtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnRadio extends JFrame implements ActionListener {
    JRadioButton pizzaButton = new JRadioButton();
    JRadioButton hamburgerButton = new JRadioButton();
    JRadioButton hotdogButton = new JRadioButton(); // what is the purpose of this line? (to create a radio button)

   ButtonGroup group = new ButtonGroup(); // what is the purpose of this line? (to group the radio buttons together)
    JButton button = new JButton("Submit"); // what is the purpose of this line? (to submit the radio button)
    BtnRadio() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton.setText("pizza"); // what is the purpose of this line? (to set the text of the radio button)
        hamburgerButton.setText("hamburger");
        hotdogButton.setText("hotdog");

        group.add(pizzaButton); // what is the purpose of this line? (to group the radio buttons together)
        group.add(hamburgerButton);
        group.add(hotdogButton);



        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.add(button);
        button.addActionListener(this); // what is the purpose of this line? (to add an action listener to the button)

        this.pack(); // what is the purpose of this line? (to fit the frame to the elements)
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button) {
            if (pizzaButton.isSelected()) {
                System.out.println("You ordered pizza");
            }
            if (hamburgerButton.isSelected()) {
                System.out.println("You ordered hamburger");
            }
            if (hotdogButton.isSelected()) {
                System.out.println("You ordered hotdog");
            }
        }

    }
}
