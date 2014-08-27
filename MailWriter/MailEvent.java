import javax.swing.*;
import java.awt.event.*;

public class MailEvent implements ActionListener {
    MailWriter gui;
   
    MailEvent(MailWriter in) {
        gui = in;
    }
    
    public void actionPerformed (ActionEvent event) {
        String command = event.getActionCommand();
        if (command.equals("Send")) {
            sendMail();
        } else if (command.equals("Cancel")) {
            clearMail();
        }
    }
    
    void sendMail() {
        System.out.println("To: " + this.gui.to.getText());
        System.out.println("Subject: " + gui.subject.getText());
        System.out.println("Body: " + gui.message.getText());
    }
    
    void clearMail() {
        gui.to.setText("");
        gui.subject.setText("");
        gui.message.setText("");
    }
}