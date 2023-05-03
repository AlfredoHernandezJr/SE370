package swing;
import javax.swing.*;
public class FirstSwingExample {
    public static void main(String args[]) {
        JFrame f = new JFrame();
        JButton b = new JButton("button");
        b.setBounds(130,130,90,90);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
