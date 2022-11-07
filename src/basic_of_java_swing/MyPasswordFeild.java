package basic_of_java_swing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class MyPasswordFeild {

    public static void main(String[] args) {

        JFrame frame1 = new JFrame("Password Text Feild"); //create java frame Instance with title
        Container container = frame1.getContentPane(); //to get the pane of the container

        frame1.setVisible(true); //to show the frame *by default its false
        frame1.setSize(500, 500); //take width and height and return the Sized Frame
        frame1.setLocationRelativeTo(null); //// this method display the JFrame to center position of a screen
        frame1.setLayout(null); //to set the layout 
        // frame1.setResizable(false);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close the run program by clicking on the close Icon

//       TODO: Start you code here -
        JPasswordField password = new JPasswordField();
        password.setBounds(10, 10, 200, 30);
        password.setEchoChar('*'); //to set hidden text
        password.setEchoChar((char)0); // how to show data        
        
        container.add(password);

    }

}