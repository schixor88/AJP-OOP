package module22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {

    private JPanel mainPanel;
    private JTextField usernameField;
    private JButton loginButton;
    private JButton cancelButton;
    private JPasswordField passwordField;

    public LoginPage(String title) {
        setTitle(title);
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setContentPane(mainPanel);
        setVisible(true);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(usernameField.getText()!=null && !usernameField.getText().isEmpty()){
                    LandingScreenGUI screenGUI = new LandingScreenGUI(usernameField.getText());
                    screenGUI.setVisible(true);
                    dispose();
                }else{
                   JOptionPane.showMessageDialog(null,"Invalid Inputs");
                }


            }
        });
    }

    public static void main(String[] args) {
        LoginPage frame = new LoginPage("MyApp");
        frame.setVisible(true);
    }



}
