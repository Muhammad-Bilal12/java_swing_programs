package basic_of_java_swing;

import javax.swing.*;
import java.awt.*;

public class myCheckBoxes {

    public static void main(String[] args) {

        JFrame f = new JFrame("JCheckBoxes");
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JCheckBox matric = new JCheckBox("Matric");
        matric.setBounds(50, 50, 100, 30);

        JCheckBox inter = new JCheckBox("InterMediate");
        inter.setBounds(50, 80, 100, 30);

        JCheckBox bechlor = new JCheckBox("Bechlor");
        bechlor.setBounds(200, 50, 100, 30);

        JCheckBox graduate = new JCheckBox("Graduate");
        graduate.setBounds(200, 80, 100, 30);
        
        
        c.add(matric);
        c.add(inter);
        c.add(bechlor);
        c.add(graduate);

        f.setVisible(true);

    }

}
