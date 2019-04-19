package window;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

// new는 가급적 위에 모아둘것 (자바는 위에서부터 순차적으로 실행하기 때문)

public class MyWindow {
	public static void main(String[] args) {
		// 프레임,
		JFrame f = new JFrame("입력값 받는 프로그램");
		f.setSize(328, 332);//창 크기
		
		//버튼 
		JButton b = new JButton("나를 눌러요");	
		b.setBackground(Color.GREEN);
		b.setForeground(Color.BLUE);
		
		//입력받는 화면 (한줄)
		JTextField text = new JTextField(25);	// 인자로 몇글자까지 받을건지 넣음
		
		//글자들 (라벨)
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요");
		label.setFont(new Font("바탕", Font.BOLD, 16));
		label.setForeground(Color.RED);
		
		//물흐르듯이 배치
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		f.getContentPane().add(label);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	// 버튼을 누르면 실행되는 액션
				System.out.println("버튼이 눌러졌군요!!");
				String data = text.getText();	// JTextField 변수로 받은 값을 가져오기
				System.out.println("당신의 주요 과목은 " + data + "군요.");
			}
		});
		
		
		f.getContentPane().add(text);
		f.getContentPane().add(b);
		
		f.setVisible(true);//창 보여줘 (버튼 등 적용위해 맨 끝에 놓을것)
	}
}
