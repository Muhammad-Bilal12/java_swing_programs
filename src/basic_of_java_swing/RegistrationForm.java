package basic_of_java_swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class RegisterForm extends JFrame implements ActionListener {

    JLabel head, name, email, gender, msg;
    JTextField nameF, emailF;
    JRadioButton male, female;
    JCheckBox terms;
    JButton submit;
    JTextArea data;

    public RegisterForm() {

        setTitle("Registration Form");
        setSize(700, 500);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(null);

        head = new JLabel("Registration Form");
        head.setBounds(250, 50, 150, 20);
        c.add(head);

        name = new JLabel("Name");
        name.setBounds(20, 100, 100, 20);
        c.add(name);

        nameF = new JTextField();
        nameF.setBounds(150, 100, 200, 20);
        c.add(nameF);

        email = new JLabel("Email");
        email.setBounds(20, 130, 100, 20);
        c.add(email);

        emailF = new JTextField();
        emailF.setBounds(150, 130, 200, 20);
        c.add(emailF);

        gender = new JLabel("Gender");
        gender.setBounds(20, 160, 100, 20);
        c.add(gender);

        male = new JRadioButton("male");
        female = new JRadioButton("female");
        male.setBounds(150, 160, 100, 20);
        female.setBounds(250, 160, 100, 20);
        male.setSelected(true);
        c.add(female);
        c.add(male);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        terms = new JCheckBox("Accept our Terms and Condition");
        terms.setBounds(100, 250, 300, 20);
        c.add(terms);

        submit = new JButton("Submit");
        submit.setBounds(150, 300, 100, 30);
        submit.addActionListener(this);
        c.add(submit);

        data = new JTextArea();
        data.setBounds(400,100,250,300);
        c.add(data);
        
        msg = new JLabel();
        msg.setBounds(20, 350, 400, 20);
        c.add(msg);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String err_msg = "Please Accept our Terms and Condition";
        String name_val, email_val;
        String gen_val = "male";
        if (terms.isSelected()) {
            err_msg = "Registeration Successfully!";
            msg.setText(err_msg);
            name_val = nameF.getText();
            email_val = emailF.getText();
            if(female.isSelected()){
            gen_val = "female";
            }
       
            data.setText("Name : " + name_val + "\n"+
            "Email : " + email_val+ "\n" +
            "Gender : " + gen_val);
        } else {
            msg.setText(err_msg);
        }
    }

}

public class RegistrationForm {

    public static void main(String[] args) {

        RegisterForm rf = new RegisterForm();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);

    }

}
