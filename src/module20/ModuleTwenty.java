package module20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModuleTwenty {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Module Twenty");
        frame.setSize(400, 400);

        CardLayout cardLayout = new CardLayout();
        frame.setLayout(cardLayout);

        JButton button1 = new JButton("One");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "btn2");
            }
        });


        JButton button2 = new JButton("Two");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "btn1");
            }
        });


        frame.add(button1, "btn1");
        frame.add(button2, "btn2");

        cardLayout.show(frame.getContentPane(), "btn1");

        frame.setVisible(true);
    }
}
