package basic_of_java_swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Myframe extends JFrame implements ActionListener {

    Container container;
    JButton btn1 = new JButton("RED");
    JButton btn2 = new JButton("Yellow");
    JButton btn3 = new JButton("GREEN");

    public Myframe() {
        container = this.getContentPane();
        container.setLayout(null);

        btn1.setBounds(100, 100, 100, 50);
        btn2.setBounds(200, 100, 100, 50);
        btn3.setBounds(300, 100, 100, 50);

        container.add(btn1);
        container.add(btn2);
        container.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            container.setBackground(Color.RED);
        } else if (e.getSource() == btn2) {
            container.setBackground(Color.YELLOW);
        } else if (e.getSource() == btn3) {
            container.setBackground(Color.GREEN);
        }

    }

}

public class ActionDemo2 {

    public static void main(String[] args) {

        Myframe frame = new Myframe();
        frame.setTitle("Action Demo2");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(Myframe.EXIT_ON_CLOSE);

    }

}
