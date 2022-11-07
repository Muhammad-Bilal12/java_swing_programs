package basic_of_java_swing;

import java.awt.Color; //AWt class for color
import java.awt.Container; //awt class for container pane

import javax.swing.ImageIcon; //pkg to used Image Icon
import javax.swing.JFrame; //import jframe library to use this functionality

public class MyFirstFrame {

    public static void main(String args[]) {

//       System.out.println("Hello JFrame");
        JFrame frame1 = new JFrame("My First jAVA Frame"); //create java frame Instance with title
        frame1.setVisible(true); //to show the frame *by default its false

        frame1.setSize(500, 500); //take width and height and return the Sized Frame
//        frame1.setLocation(200,100); //set Location on the screen
//        frame1.setBounds(500,800,200,300); //shorthand property of *size and location*

//        To Center Frame in Screen 
// By default, a JFrame can be displayed at the top-left position of a screen. 
// We can display the center position of JFrame using the setLocationRelativeTo() method of Window class.
// public void setLocationRelativeTo(Component c)
        frame1.setLocationRelativeTo(null); //// this method display the JFrame to center position of a screen
        frame1.setTitle("Java Frame"); // to set the title

//to set Icon Image
        ImageIcon my_icon = new ImageIcon("F:\\Bilal\\All About Java\\Java GUI\\Java Swing\\Basic_of_java_swing\\src\\basic_of_java_swing\\b_logo.png");
        frame1.setIconImage(my_icon.getImage()); // to setIconImage

//        We need Container Pane to Set the background color of our frame

Container container = frame1.getContentPane(); //to get the pane of the container
        
        container.setBackground(Color.yellow);
        
frame1.setResizable(false); //to off the resizable property 
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //to close the run program by clicking on the close Icon

    }

}
