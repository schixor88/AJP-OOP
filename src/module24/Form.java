package module24;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Form extends JFrame {
    private JPanel panel1;
    private JScrollPane scroll;

    Form() {
        super();
        setSize(900, 400);
        setVisible(true);
        setContentPane(panel1);


    }


    public static void main(String[] args) {
        new Form();
    }


}
