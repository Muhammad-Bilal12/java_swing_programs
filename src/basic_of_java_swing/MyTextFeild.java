package basic_of_java_swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyTextFeild {

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("My Jlabel"); //create java frame Instance with title
        Container container = frame1.getContentPane(); //to get the pane of the container

        frame1.setVisible(true); //to show the frame *by default its false
        frame1.setSize(500, 500); //take width and height and return the Sized Frame
        frame1.setLocationRelativeTo(null); //// this method display the JFrame to center position of a screen
        frame1.setLayout(null); //to set the layout 
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close the run program by clicking on the close Icon
        
//       TODO: Start you code here -

        JTextField userTextFeild = new JTextField();  //create Textfeild Object
        userTextFeild.setBounds(100,100,200,20); //set size and location
        userTextFeild.setText("Enter Name"); //set Default Text
                
        userTextFeild.setForeground(Color.GREEN); //Set Font Color
        userTextFeild.setBackground(Color.ORANGE); //Set Background Color
        
        userTextFeild.setEditable(false); //to make it editable or not
        
        
        
        container.add(userTextFeild);
        
        
                
        
        
        
        



        
        
    }

}
