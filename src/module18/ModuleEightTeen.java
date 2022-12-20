package module18;

import javax.swing.*;
import java.awt.*;

public class ModuleEightTeen {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(200,200);

        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");

        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentX(Component.LEFT_ALIGNMENT);
        label1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        frame.add(button1);
        frame.add(button2);
        frame.add(label1);
        frame.add(label2);

        frame.setVisible(true);


    }
}
