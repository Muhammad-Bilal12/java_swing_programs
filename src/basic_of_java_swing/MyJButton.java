package basic_of_java_swing;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJButton {

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("My Jlabel"); //create java frame Instance with title
        Container container = frame1.getContentPane(); //to get the pane of the container

        frame1.setVisible(true); //to show the frame *by default its false
        frame1.setSize(500, 500); //take width and height and return the Sized Frame
        frame1.setLocationRelativeTo(null); //// this method display the JFrame to center position of a screen
        frame1.setLayout(null); //to set the layout 
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close the run program by clicking on the close Icon

//       TODO: Start you code here -


        JButton btn = new JButton("Click Button");
        btn.setBounds(20,30,150,40);
        btn.setFont(new Font("Roboto",Font.PLAIN,18));
        btn.setIcon(new ImageIcon("F:\\Bilal\\All About Java\\Java GUI\\Java Swing\\Basic_of_java_swing\\src\\basic_of_java_swing\\b_logo.png"));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
//        btn.setVisible(false);
        
        
        


        


        container.add(btn);

    }

}
