package basic_of_java_swing;

import java.awt.Color; //AWt class for color
import java.awt.Container; //awt class for container pane
import java.awt.Font;

import javax.swing.ImageIcon; //pkg to used Image Icon
import javax.swing.JFrame; //import jframe library to use this functionality
import javax.swing.JLabel;

public class MyJlabel {

    public static void main(String args[]) {

        JFrame frame1 = new JFrame("My Jlabel"); //create java frame Instance with title
        JLabel label1 = new JLabel("Username"); //create the object of Jlabel
        Font font = new Font("Arial", Font.BOLD, 14); //define font object with some property

        frame1.setVisible(true); //to show the frame *by default its false

        frame1.setSize(500, 500); //take width and height and return the Sized Frame

        frame1.setLocationRelativeTo(null); //// this method display the JFrame to center position of a screen

        frame1.setLayout(null); //to set the layout 

        label1.setFont(font); //set the font on label

        label1.setBounds(10, 20, 100, 50); //to locate the label on jframe

        frame1.add(label1); //add label in jframe

        Container container = frame1.getContentPane(); //to get the pane of the container

//        To show Image 
        ImageIcon labelImage = new ImageIcon("F:\\Bilal\\All About Java\\Java GUI\\Java Swing\\Basic_of_java_swing\\src\\basic_of_java_swing\\b_logo.png");
        JLabel imageLabel = new JLabel(labelImage);
        
        
        imageLabel.setBounds(50,50, labelImage.getIconWidth()/2, labelImage.getIconHeight()/2);

//        frame1.add(imageLabel);

//        Jlabel with Image Icon

JLabel labelWithImage = new JLabel("Image With Label",labelImage,JLabel.LEFT); //Image With label
labelWithImage.setBounds(100,100,labelImage.getIconWidth()+150,labelImage.getIconHeight()); //setsize and Location

frame1.add(labelWithImage);






        
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //to close the run program by clicking on the close Icon

    }

}
