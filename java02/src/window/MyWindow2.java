package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//1. 프레임 만들기 (300 X 300)
//2. "자바 프로젝트" 버튼을 만들기
//3. 눌렀을때, "다음주부터 자바프로젝트가 시작됩니다."

public class MyWindow2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setTitle("자바 프로젝트 시작");
		
		JButton b = new JButton("자바 프로젝트");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("다음주부터 자바 프로젝트가 시작됩니다.");
			}
		});
		f.getContentPane().add(b);
		
		f.setVisible(true);
	}
}
