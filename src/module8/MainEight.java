package module8;

import javax.swing.*;
import java.awt.*;

public class MainEight {
    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon("micon.png");
        Image image = imageIcon.getImage(); // transforming
        Image nImage = image.getScaledInstance(100,70, Image.SCALE_SMOOTH); // scaling
        ImageIcon nImageIcon = new ImageIcon(nImage);// new scaled image instance


        JLabel label1 = new JLabel();
        label1.setText("Welcome to MyApp");
        label1.setIcon(nImageIcon); // using new scaled image



        // center in parent
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);

        //since we have to use the frame
        MyFrame frame = new MyFrame();
        frame.add(label1);

    }
}
