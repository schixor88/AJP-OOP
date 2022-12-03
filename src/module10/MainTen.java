package module10;

import javax.swing.*;
import java.awt.*;

public class MainTen {

    public static void main(String[] args) {
        // JPanel is a GUI Component that acts as container to hold other components


        //Module 10 add a label in module 9
        ImageIcon icon = new ImageIcon("./src/module10/smile.png");
        Image newImage = icon.getImage()
                .getScaledInstance(50,50, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);


        JLabel label = new JLabel();
        label.setText("Hello World");
        label.setIcon(newIcon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);


        // previous module 9
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,250,250);
        panel1.setBackground(Color.red);


        JPanel panel2 = new JPanel();
        panel2.setBounds(250,0,250,250);
        panel2.setBackground(Color.blue);


        JPanel panel3 = new JPanel();
        panel3.setBounds(0,250,500,250);
        panel3.setBackground(Color.green);


        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);//Important
        frame.setTitle("Module 10");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //adding components
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

    }
}
