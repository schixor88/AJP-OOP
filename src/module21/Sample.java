package module21;

import javax.swing.*;

public class Sample extends JFrame {
    private JButton buttonOne;
    private JButton buttonTwo;
    private JPanel mainPanel;

    public Sample(String title) {
        setTitle(title);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(mainPanel);
//        this.pack();
    }

    public static void main(String[] args) {
        new Sample("Module 21");
    }
}
