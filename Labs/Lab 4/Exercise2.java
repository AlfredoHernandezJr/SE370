package swing ;
import javax.swing.*;
import java.awt.event.*;

public class Exercise2 implements ActionListener{
    JTextField t1, t2;
    JButton loginButton;

    int size = 80 ;
    int yDirButton = 250 ;

    Exercise2(){
        JFrame f = new JFrame();

        t1 = new JTextField();
        t1.setBounds(100,130,90,30);

        t2 = new JTextField();
        t2.setBounds(100,160,90,30);

        loginButton = new JButton("Login");
        loginButton.setBounds(100,yDirButton,size,size);

        loginButton.addActionListener(this);

        f.add(t1);
        f.add(t2);

        f.add(loginButton);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();

        if(s1.equals("software") && s2.equals("engineering"))
        {
            System.out.println("Success") ;
        }
        else
        {
            System.out.println("Unsuccessful");
        }
    }
    public static void main(String[] args) {
        new swing.Exercise2();
    }
}