package swing;
import javax.swing.*;
public class JSwingExtendJFrame extends JFrame{
JFrame f;
JSwingExtendJFrame(){
JButton b = new JButton("button");
b.setBounds(100,100,90,90);
add(b);
setSize(300,400);
setLayout(null);
setVisible(true);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new JSwingExtendJFrame();
}
}
