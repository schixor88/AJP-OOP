package module28;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerImpExample implements ActionListener {


    ActionListenerImpExample() {
        Frame f = new Frame("ActionListener Example");
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(this);

        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }


    public static void main(String[] args) {
        new ActionListenerImpExample();
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicks!");
    }
}
