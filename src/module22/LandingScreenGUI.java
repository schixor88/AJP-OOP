package module22;

import javax.swing.*;

public class LandingScreenGUI extends JFrame {
    private JPanel mainPanel;
    private JPanel topMenuPanel;
    private JPanel leftNavPanel;
    private JPanel centerPanel;
    private JLabel validUserName;

    public LandingScreenGUI(String username){
        super();
        setContentPane(mainPanel);
        setExtendedState(6);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUsername(username);

    }

    private void setUsername(String username){
        validUserName.setText(username);
    }

}
