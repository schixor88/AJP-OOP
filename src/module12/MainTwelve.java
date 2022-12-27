package module12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainTwelve implements ActionListener {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("Twelve");
        frame.setVisible(true);

        frame.setLayout(null);

        JLabel label1 = new JLabel("Label 1");
        label1.setBounds(20,20,100,20);
        frame.add(label1);

        JLabel label2 = new JLabel("Label 2");
        label2.setBounds(150,200,100,20);
        frame.add(label2);

        JButton button1 = new JButton("Button 1");
        button1.setBounds(200,300,100,30);
        frame.add(button1);

//        button1.addActionListener(this);

        JButton button2 = new JButton("Button 2");
        button2.setBounds(20,70,100,30);
        frame.add(button2);


    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
