import javax.swing.*;
import java.awt.event.*;

public class CrisisEvent implements ActionListener {
    Crisis gui;
    String message;
    
    public CrisisEvent(Crisis in) {
        gui = in;
    }
    
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (command.equals("Panic")) {
            message = "You must have forgotten your towel!";
        } else if (command.equals("Don't Panic")) {
            message = "Yay, you have your towel!";
        } else if (command.equals("Blame Others")) {
            message = "Don't forget to make counter accusations!";
        } else if (command.equals("Notify the Media")) {
            message = "I guess you can get the Drudge Report " +
                "to put it on their site.";
        } else if (command.equals("Save Yourself")) {
            message = "Um, not sure how to do that.";
        } else {
            message = "I have no idea what you tried to do.";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
    
