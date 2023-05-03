package swing;
import javax.swing.*;
public class Exercise1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example text fields");
        JTextField t1,t2;

        JButton b = new JButton("login");
        b.setBounds(100,220 ,90,90);


        t1 = new JTextField();
        t1.setBounds(100,130,90,30);

        t2 = new JTextField();
        t2.setBounds(100,180,90,30);

        f.add(t1);
        f.add(t2);
        f.add(b);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}