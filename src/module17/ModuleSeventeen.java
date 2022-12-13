package module17;

import javax.swing.*;
import java.awt.*;

public class ModuleSeventeen {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(600,400);

        frame.setTitle("Seventeen");

        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2"); // MAIN AREA

        frame.setLayout(new BorderLayout());

        frame.add(label1,BorderLayout.NORTH);
        frame.add(label2,BorderLayout.SOUTH);
        frame.add(button1,BorderLayout.WEST);
        frame.add(button2,BorderLayout.CENTER);


        frame.setVisible(true);


    }
}
