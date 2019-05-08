package asdf;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;

public class asdf {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 400);
		f.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(0, 0, 684, 361);
		f.getContentPane().add(list);
		
		f.setVisible(true);
	}
}
