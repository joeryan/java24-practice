import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame {
   // set up panic row
   JPanel panicRow = new JPanel();
   JButton panicButton = new JButton("Panic!");
   JButton dontPanicButton = new JButton("Don't Panic!");
   
   // set up blame row
   JPanel blameRow = new JPanel();
   JButton blameButton = new JButton("Blame Others");
   JButton mediaButton = new JButton("Notify the Media");
   JButton saveButton = new JButton("Save Yourself!");
   
   public Crisis() {
       super("Crisis");
       setSize(472, 128);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       GridLayout layout = new GridLayout(2, 1, 10, 10);
       setLayout(layout);
       
       FlowLayout panicFlow = new FlowLayout(FlowLayout.CENTER, 1, 2);
       panicRow.setLayout(panicFlow);
       panicRow.add(panicButton);
       panicRow.add(dontPanicButton);
       add(panicRow);
       
       FlowLayout blameFlow = new FlowLayout(FlowLayout.CENTER, 1, 3);
       blameRow.setLayout(blameFlow);
       blameRow.add(blameButton);
       blameRow.add(mediaButton);
       blameRow.add(saveButton);
       add(blameRow);
       setVisible(true);
   }
   
   public static void main(String[] args) {
       Crisis theCrisis = new Crisis();
   }
}