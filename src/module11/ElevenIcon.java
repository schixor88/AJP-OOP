package module11;

import javax.swing.*;
import java.awt.*;

public class ElevenIcon {

    public static ImageIcon getResizedImage(
            String imagePath,
            int width, int height
    ) {

        Image image = new ImageIcon(imagePath).getImage().getScaledInstance(
                width, height, Image.SCALE_SMOOTH
        );

        return new ImageIcon(image);

    }

}
