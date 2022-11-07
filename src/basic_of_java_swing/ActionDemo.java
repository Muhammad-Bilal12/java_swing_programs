package basic_of_java_swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
    
    Container container;
    JButton btn;
    
    public MyFrame() {
        container = this.getContentPane();
        container.setLayout(null);
        
        btn = new JButton("Click Me");
        btn.setBounds(200, 200, 150, 50);
        btn.addActionListener(this);
        
        container.add(btn);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
    container.setBackground(Color.yellow);
    }

    
    
    
}

public class ActionDemo {
    
    public static void main(String[] args) {
        
        MyFrame frame = new MyFrame();
        frame.setTitle("Action Demo");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        
    }
    
}
