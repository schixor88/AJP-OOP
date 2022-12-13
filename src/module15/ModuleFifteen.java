package module15;

import javax.swing.*;
import java.awt.*;

public class ModuleFifteen {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(400,400);
        frame.setTitle("Fifteen");

        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight =  1;
        JButton one = new JButton("1");
        frame.add(one,gbc);


        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight =  1;
        JButton two = new JButton("2");
        frame.add(two,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight =  1;
        JButton three = new JButton("3");
        frame.add(three,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight =  1;
        JButton four = new JButton("4");
        frame.add(four,gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton five = new JButton("5");
        frame.add(five,gbc);

        frame.setVisible(true);


    }
}
