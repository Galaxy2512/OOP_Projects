package CheckBox;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CHBox extends JFrame implements ActionListener {


    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton("Submit");

    CHBox() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout()); // why FlowLayout has error? (it's not imported). No that is not a reason. It's because you have to import java.awt.FlowLayout



        button.addActionListener(this);
        button.setFocusable(false);
        button.setFont(new Font("Consolas", Font.PLAIN, 35));

        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.addActionListener(this);



        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) { // what is the purpose of this method? (to check if the checkbox is checked or not)
        if (actionEvent.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }

    }
}
