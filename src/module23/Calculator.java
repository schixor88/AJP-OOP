package module23;

import javax.swing.*;

public class Calculator extends JFrame {
    private JTextField a0TextField;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton delete;
    private JButton btnProduct;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnDifference;
    private JButton a0Button;
    private JButton btnDecimal;
    private JButton btnTotal;
    private JPanel mainPanel;
    private JPanel buttons;
    private JButton button1;

    public Calculator() {
        setTitle("Calculator");
        setSize(400,300);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setResizable(false);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
