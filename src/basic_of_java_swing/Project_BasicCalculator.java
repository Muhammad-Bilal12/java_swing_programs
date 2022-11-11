package basic_of_java_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorFrame extends JFrame implements ActionListener {

    Container c;
    JLabel firstVal, secondVal, result;
    JTextField firstField, secondFeild, resultFeild;
    JButton add, sub, mul, div;

    public CalculatorFrame() {
        setSize(600, 600);
        setTitle("Basic Calculator");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        firstVal = new JLabel("First Input");
        firstVal.setBounds(100, 100, 100, 30);
        c.add(firstVal);

        firstField = new JTextField();
        firstField.setBounds(200, 100, 150, 30);
        c.add(firstField);

        secondVal = new JLabel("Second Input");
        secondVal.setBounds(100, 200, 100, 30);
        c.add(secondVal);

        secondFeild = new JTextField();

        secondFeild.setBounds(200, 200, 150, 30);
        c.add(secondFeild);

        result = new JLabel("Result");
        result.setBounds(100, 300, 100, 30);
        c.add(result);

        resultFeild = new JTextField();
        resultFeild.setBounds(200, 300, 150, 30);
        resultFeild.setEditable(false);
        c.add(resultFeild);

        add = new JButton("+");
        add.setBounds(120, 400, 50, 30);
        add.addActionListener(this);
        c.add(add);

        sub = new JButton("-");
        sub.setBounds(190, 400, 50, 30);
        sub.addActionListener(this);
        c.add(sub);

        mul = new JButton("X");
        mul.setBounds(250, 400, 50, 30);
        mul.addActionListener(this);
        c.add(mul);

        div = new JButton("/");
        div.setBounds(320, 400, 50, 30);
        div.addActionListener(this);

        c.add(div);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int val1 = Integer.valueOf(firstField.getText());
        int val2 = Integer.valueOf(secondFeild.getText());
        double res;
        if (ae.getSource() == add) {
            res = val1+val2;
            resultFeild.setText(String.valueOf(res));
        }
        if (ae.getSource() == sub) {
            res = val1-val2;
            resultFeild.setText(String.valueOf(res));
        }
        if (ae.getSource() == mul) {
            res = val1*val2;
            resultFeild.setText(String.valueOf(res));
        }
        if (ae.getSource() == div) {
            res = (double)val1/(double)val2;
            resultFeild.setText(String.valueOf(res));
        }

//        System.out.println(val1 + " " + val2);
    }

}

public class Project_BasicCalculator {

    public static void main(String[] args) {

        CalculatorFrame calculator = new CalculatorFrame();

    }

}
