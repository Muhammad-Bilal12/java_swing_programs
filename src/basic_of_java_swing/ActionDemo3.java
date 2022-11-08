package basic_of_java_swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionDemo3 {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Avtion Demo3");
        Container c = frame.getContentPane();
        JButton btn = new JButton("RED");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(Myframe.EXIT_ON_CLOSE);
        c.setLayout(null);
        c.setBackground(Color.white);
        btn.setBounds(100, 100, 100, 50);
        c.add(btn);
        
        btn.addActionListener((ActionEvent ae) -> {
            
            c.setBackground(Color.yellow);
            
            
        });
        
    }
    
}
