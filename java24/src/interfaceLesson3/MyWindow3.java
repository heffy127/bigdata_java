package interfaceLesson3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3 extends JFrame implements ActionListener{
	JButton b;	// 전역변수
	JButton b2;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.out.println("나를 눌러요.입니다.");
		} else if(e.getSource() == b2) {
			System.out.println("나도 눌러요.입니다.");
		}
	}

	public MyWindow3() {
		setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b = new JButton("나를 눌러요");
		add(b);
		b2 = new JButton("나도 눌러요");
		add(b2);
		//b.addActionListener(new ActionProcess());
		b.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow3 win = new MyWindow3();
	}
	
}
