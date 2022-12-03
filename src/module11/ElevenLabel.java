package module11;

import javax.swing.*;

public class ElevenLabel extends JLabel {

    ElevenLabel(
            String text
    ){
        this.setText(text);
    }

    ElevenLabel(
            String text, Icon icon) {
        this.setText(text);
        this.setIcon(icon);
    }

    ElevenLabel(
            String text,
            int verticalAlignment,
            int horizontalAlignment) {
        this.setText(text);
        this.setVerticalAlignment(verticalAlignment);
        this.setHorizontalAlignment(horizontalAlignment);
    }


    ElevenLabel(
            String text,
            Icon icon,
            int verticalAlignment,
            int horizontalAlignment) {
        this.setText(text);
        this.setIcon(icon);
        this.setVerticalAlignment(verticalAlignment);
        this.setHorizontalAlignment(horizontalAlignment);
    }

}