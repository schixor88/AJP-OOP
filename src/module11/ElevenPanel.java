package module11;

import javax.swing.*;
import java.awt.*;

public class ElevenPanel extends JPanel {

    ElevenPanel(int x,
                int y, int width, int height,
                Color bg
                ) {
        this.setBounds(x, y, width, height);
        this.setBackground(bg);
    }
}
