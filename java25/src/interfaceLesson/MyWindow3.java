package interfaceLesson;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3 extends JFrame{
	JButton b;	// 전역변수
	JButton b2;

	public MyWindow3() {
		setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b = new JButton("나를 눌러요");
		add(b);
		b2 = new JButton("나도 눌러요");
		add(b2);
		//b.addActionListener(new ActionProcess());
		ActionListener action = new ActionListener() {	// 익명 클래스 (ActionListener를 구현한 이름없는 클래스)
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀군요.");
			}
		};
		b.addActionListener(action);
		b2.addActionListener(new ActionListener() {	// 익명 클래스를 바로 구현
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("두 번째 버튼을 눌렀습니다.");
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow3 win = new MyWindow3();
	}
	
}
