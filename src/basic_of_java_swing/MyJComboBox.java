package basic_of_java_swing;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MyJComboBox {

    public static void main(String[] args) {
        JFrame f = new JFrame("JCOMBO BOX");
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = f.getContentPane();
        c.setLayout(null);
        String[] val = {"A","B","C","D"};
        JComboBox comboBox = new JComboBox(val);
       comboBox.setBounds(100,100,100,50);
        
       comboBox.addItem("F");
       
       c.add(comboBox);
        
       JLabel label = new JLabel();
       label.setBounds(200,100,100,20);
       c.add(label);
       
       
       JButton btn = new JButton("Cilck Me");
       btn.setBounds(300,300,100,50);

       btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
           
         String item = (String)comboBox.getSelectedItem();
           label.setText(item);
           System.out.println(comboBox.getSelectedItem().toString());
              
                
            }
        });
       
       
//       btn.addActionListener((ae) -> {
//       
//           String item = (String)comboBox.getSelectedItem();
//           label.setText(item);
//           System.out.println(comboBox.getSelectedItem().toString());
//       });
       
       
       c.add(btn);
        f.setVisible(true);
    }




    
}
