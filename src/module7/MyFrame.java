package module7;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setSize(500,500);
        this.setTitle("Module 7");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        this.getContentPane().setBackground(new Color(100,200,200));
    }
}
