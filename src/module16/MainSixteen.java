package module16;

import javax.swing.*;
import java.awt.*;

public class MainSixteen {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(400,400);
        frame.setTitle("Sixteen");

        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JButton sum = new JButton("Sum");
        JButton difference = new JButton("Difference");
        JButton product = new JButton("Product");
        JButton modulus = new JButton("Modulus");
        JButton exponent = new JButton("Exponent");
        JButton matrix = new JButton("Matrix");
        JButton vector = new JButton("Vector");


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        frame.add(sum,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        frame.add(matrix,gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        frame.add(vector,gbc);


        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(difference,gbc);


        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(product,gbc);


        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(modulus,gbc);


        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(exponent,gbc);

        frame.setVisible(true);



    }
}
