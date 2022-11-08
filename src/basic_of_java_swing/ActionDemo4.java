package basic_of_java_swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionDemo4 {

    public static Container c;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Action Demo 4");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = frame.getContentPane();
        c.setLayout(null);
        
        JButton red = new JButton("RED");
        JButton green = new JButton("green");
        JButton yellow = new JButton("yellow");

    red.setBounds(50,50,100,50);
    green.setBounds(150,50,100,50);
    yellow.setBounds(250,50,100,50);
    
    c.add(red);
    c.add(green);
    c.add(yellow);
    
    red.addActionListener(new RedBtn());
    green.addActionListener(new GreenBtn());
    yellow.addActionListener(new YellowBtn());
    
    
    }
    

}



class RedBtn implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
     ActionDemo4.c.setBackground(Color.RED);
    
    }
}



class GreenBtn implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
     ActionDemo4.c.setBackground(Color.GREEN);
    
    }
}



class YellowBtn implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
     ActionDemo4.c.setBackground(Color.YELLOW);
    
    }
}