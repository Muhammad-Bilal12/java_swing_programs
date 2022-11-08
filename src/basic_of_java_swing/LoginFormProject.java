package basic_of_java_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginFrame extends JFrame implements ActionListener {

    Container c;
    JLabel username;
    JLabel password;
    JTextField userFeild;
    JPasswordField passwordFeild;

    JButton loginBtn;

    LoginFrame() {
        setTitle("Login Form");
        setSize(600, 400);
        setLocationRelativeTo(null);
        c = getContentPane();
        c.setLayout(null);
        username = new JLabel("Username : ");
        username.setBounds(50, 100, 100, 40);
        c.add(username);
        password = new JLabel("Password : ");
        password.setBounds(50, 150, 100, 40);
        c.add(password);

        userFeild = new JTextField();
        userFeild.setBounds(200, 110, 200, 30);
        c.add(userFeild);

        passwordFeild = new JPasswordField();
        passwordFeild.setBounds(200, 160, 200, 30);
        c.add(passwordFeild);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(200, 250, 200, 30);
        loginBtn.addActionListener(this);
        c.add(loginBtn);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        System.out.println(userFeild.getText());
        System.out.println(passwordFeild.getText());
    }

}

public class LoginFormProject {

    public static void main(String[] args) {

        LoginFrame login = new LoginFrame();

    }

}
