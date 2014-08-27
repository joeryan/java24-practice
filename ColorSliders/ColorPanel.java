import java.awt.*;
import javax.swing.*;

public class ColorPanel extends JPanel {
    Color background;
    
    ColorPanel() {
        background = Color.red;
    }
    
    protected void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(background);
        comp2D.fillRect(0,0, getSize().width, getSize().height);
    }
    
    public void changeColor(Color newBackground) {
        background = newBackground;
    }
}