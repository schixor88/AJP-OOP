package module13;

import javax.swing.*;
import java.awt.*;

public class MainThirteen {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(400,400);
        frame.setTitle("Thirteen");



        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");

        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(zero);

        frame.setVisible(true);



    }
}
