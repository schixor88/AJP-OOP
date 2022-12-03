package module11;

import javax.swing.*;
import java.awt.*;

public class MainEleven {
    public static void main(String[] args) {

        //make class ElevenIcon which will return resized image
        ImageIcon resizedImage = ElevenIcon.getResizedImage(
                "./src/module10/smile.png",
                50,50
        );

        //make classes as ElevenPanel and Eleven Frame by extending

        ElevenPanel panel11 = new ElevenPanel(0, 0, 250, 250, Color.red);
        ElevenPanel panel12 = new ElevenPanel(250, 0, 250, 250, Color.yellow);
        ElevenPanel panel13 = new ElevenPanel(0, 250, 500, 250, Color.green);

        ElevenFrame frame11 = new ElevenFrame();

        frame11.add(panel11);
        frame11.add(panel12);
        frame11.add(panel13);


        //Male label by extension
        ElevenLabel label1 = new ElevenLabel(
                "Hello Label",
                resizedImage,
                JLabel.TOP,
                JLabel.LEFT
        );

        panel12.add(label1);
    }
}
