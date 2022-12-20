package components;

import javax.swing.*;

public class GeneralFrame extends JFrame {

    public GeneralFrame() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public GeneralFrame(String title) {
        this.setTitle(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public GeneralFrame(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
