package interfacePractice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButtonWindow extends JFrame implements ActionListener {
	JButton b1;
	JButton b2;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1)
			System.out.println("버튼1 클릭");
		else if (e.getSource() == b2)
			System.out.println("버튼2 클릭");
	}

	public MyButtonWindow() {
		setSize(200, 200);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		b1 = new JButton("버튼1");
		add(b1);
		b2 = new JButton("버튼2");
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);

		setVisible(true);
	}
	

	public static void main(String[] args) {
		MyButtonWindow mbw = new MyButtonWindow();
	}
}
