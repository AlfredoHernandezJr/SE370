import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JMenubar extends JFrame implements ActionListener{
	
	static JMenuBar mb;
	
	static JMenu x,x1;
	
	static JMenuItem m1, m2, m3, s1, s2;
	
	static JFrame f;
	
	static JLabel l;
	
	public static void main(String args[]) {
		
		JMenubar m = new JMenubar();
		 f = new JFrame("Menubar example");
		 l = new JLabel("no task right now");
		 mb = new JMenuBar();
		 x = new JMenu("Store activities");
		 x1 = new JMenu("Donut sales");
		 
		 
		 m1 = new JMenuItem("Order donuts");
		 m2 = new JMenuItem("Login to system");
		 m3 = new JMenuItem("Update database");
		 s1 = new JMenuItem("Sales data");
		 s2 = new JMenuItem("Exceptional: refund/replace");
		 
		 m1.addActionListener(m);
		 m2.addActionListener(m);
		 m3.addActionListener(m);
		 s1.addActionListener(m);
		 s2.addActionListener(m);
		 
		 x.add(m1);
		 x.add(m2);
		 x.add(m3);
		 x1.add(s1);
		 x1.add(s2);
		 
		 x.add(x1);
		 
		 mb.add(x);
		 
		 f.setJMenuBar(mb);
		 
		 f.add(l);
		 
		 f.setSize(400,400);
		 f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		
		l.setText(s + " option is selected");
	}
}
