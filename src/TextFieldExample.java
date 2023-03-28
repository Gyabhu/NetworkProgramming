import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample implements ActionListener {
    JTextField tf1,tf2,tf3;
    JButton b1, b2,b3,b4,b5,b6;
    TextFieldExample(){
        JFrame f= new JFrame();
        tf1 = new JTextField();
        tf1.setBounds(50,50,150,20);
        tf2 = new JTextField();
        tf2.setBounds(50,100,150,20);
        tf3 = new JTextField();
        tf3.setBounds(50,150,150,20);
        tf3.setEditable(false);
        b1 = new JButton("+");
        b1.setBounds(50,200,50,25);
        b2 = new JButton("-");
        b2.setBounds(120,200,50,25);
        b3 = new JButton("/");
        b3.setBounds(190,200,50,25);
        b4 = new JButton("*");
        b4.setBounds(50,230,50,25);
        b5 = new JButton("sqr");
        b5.setBounds(120,230,50,25);
        b6 = new JButton("sqrt");
        b6.setBounds(190,230,50,25);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }else if(e.getSource()==b2){
            c=a-b;
        } else if (e.getSource()==b3) {
            c = a/b;
        }
        else if(e.getSource()==b4) {
            c = a*b;
        } else if (e.getSource()==b5) {
            c = a;
        }else {
            c= b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
    }
}
