package interfaceLesson3;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame{
	
	public MyWindow() {
		setSize(300, 300);
		JButton b = new JButton("나를 눌러요");
		add(b);
		b.addActionListener(new ActionProcess());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow win = new MyWindow();
	}
	
}
