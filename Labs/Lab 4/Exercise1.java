package swing ;
import javax.swing.*;
import java.awt.event.*;

public class Exercise1 implements ActionListener{
    JTextField t1, t2, t3;
    JButton add, sub, div, mult ;

    int size = 50 ;
    int yDirButton = 250 ;

    Exercise1(){
        JFrame f = new JFrame();

        t1 = new JTextField();
        t1.setBounds(100,130,90,30);

        t2 = new JTextField();
        t2.setBounds(100,160,90,30);

        t3 = new JTextField();
        t3.setBounds(100,190,90,30);

        add = new JButton("+");
        add.setBounds(100,yDirButton,size,size);

        sub = new JButton("-");
        sub.setBounds(150,yDirButton,size,size);

        div = new JButton("/");
        div.setBounds(200,yDirButton,size,size);

        mult = new JButton("*");
        mult.setBounds(250,yDirButton,size,size);


        add.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mult.addActionListener(this);

        f.add(t1);
        f.add(t2);
        f.add(t3);

        f.add(add);
        f.add(sub);
        f.add(div);
        f.add(mult);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();

        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);

        String button = ((JButton) e.getSource()).getText() ;

        switch(button)
        {
            case "+":
                t3.setText("" + (a + b)) ;
                break;
            case "-":
                t3.setText("" + (a - b)) ;
                break;

            case "*":
                t3.setText("" + (a * b)) ;
                break;
            case "/":
                t3.setText("" + (a / b)) ;
                break;

            default:
                System.out.println("No matching operators found");
                return;
        }


    }
    public static void main(String[] args) {
        new swing.Exercise1();
    }
}
