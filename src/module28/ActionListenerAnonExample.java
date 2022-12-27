package module28;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerAnonExample {

    ActionListenerAnonExample() {
        Frame f = new Frame("ActionListener Example");
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicks! Anon");
            }
        });

        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }


    public static void main(String[] args) {
        new ActionListenerAnonExample();
    }

}
