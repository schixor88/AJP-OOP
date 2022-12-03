package module9;

import javax.swing.*;
import java.awt.*;

public class MainNine {
    public static void main(String[] args) {

        // JPanel is a GUI Component that acts as container to hold other components

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,250,250);
        panel1.setBackground(Color.red);


        JPanel panel2 = new JPanel();
        panel2.setBounds(250,0,250,250);
        panel2.setBackground(Color.green);


        JPanel panel3 = new JPanel();
        panel3.setBounds(0,250,500,250);
        panel3.setBackground(Color.blue);


        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);//Important
        frame.setTitle("Module 9");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //adding components
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }
}
