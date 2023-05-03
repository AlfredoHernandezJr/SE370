package swing;
import javax.swing.*;
public class JtextfieldExample {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        JFrame f = new JFrame("Example text fields");
        JTextField t1,t2;
        t1 = new JTextField();
        t1.setBounds(100,130,90,30);
        t2 = new JTextField();
        t2.setBounds(100,180,90,30);
        f.add(t1);
        f.add(t2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}