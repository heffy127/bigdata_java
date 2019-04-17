package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500); // 창 사이즈
		f.setTitle("나의 첫번째 그래픽 프로그램"); // 창 타이틀
		
		JButton b1 = new JButton("나를 눌러주세요");	// 버튼 부품 생성 (아직 안보임)
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 버튼 눌렀을때 발생되는 액션
				 System.out.println("나를 눌렀군요!!");
			}
		});
		f.getContentPane().add(b1, BorderLayout.CENTER);	// 창에 버튼 장착
		
		f.setVisible(true);	// 창 보여짐(맨끝에 둘것)
	}
}
