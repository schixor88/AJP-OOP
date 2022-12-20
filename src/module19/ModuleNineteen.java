package module19;

import javax.swing.*;
import java.awt.*;

public class ModuleNineteen {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(300,200);

        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");

        button1.setAlignmentY(Component.TOP_ALIGNMENT);
        button2.setAlignmentY(Component.CENTER_ALIGNMENT);
        label1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        label2.setAlignmentY(Component.TOP_ALIGNMENT);




        frame.add(button1);
        frame.add(button2);
        frame.add(label1);
        frame.add(label2);



        frame.setVisible(true);
    }
}
