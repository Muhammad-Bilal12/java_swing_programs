package basic_of_java_swing;

import java.awt.Container;
import javax.swing.*;

public class MyRadioBtn {

    public static void main(String[] args) {

        JFrame f = new JFrame("J Radio BTN");
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(null);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(100, 100, 100, 50);
        female.setBounds(200, 100, 100, 50);

        c.add(male);
        c.add(female);

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        f.setVisible(true);
    }

}
