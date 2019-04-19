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

public class MyWindow3 {
	public static void main(String[] args) {

		JFrame frame = new JFrame("입력값 받는 프로그램");
		frame.getContentPane().setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 12));
		frame.setSize(339, 346);//창 크기
		
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요");
		label.setFont(new Font("바탕", Font.BOLD, 16));
		label.setForeground(Color.RED);
		
		JLabel label2 = new JLabel("당신이 사용하는 개발 툴을 입력하세요.");
		label2.setFont(new Font("나눔고딕", Font.BOLD, 16));
		label2.setForeground(Color.MAGENTA);
		
		JTextField text = new JTextField(25);
		text.setForeground(Color.RED);
		text.setBackground(Color.CYAN);
		JTextField text2 = new JTextField(25);
		text2.setForeground(new Color(0, 0, 205));
		text2.setBackground(Color.CYAN);
		
		JButton button = new JButton("과목 버튼");	
		button.setFont(new Font("바탕체", Font.BOLD | Font.ITALIC, 13));
		button.setBackground(Color.GREEN);
		button.setForeground(Color.BLUE);


		FlowLayout flow = new FlowLayout();
		frame.getContentPane().setLayout(flow);
		
		frame.getContentPane().add(label);
		frame.getContentPane().add(text);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(text2);
		frame.getContentPane().add(button);
		
		JButton button2 = new JButton("툴 버튼");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data2 = text2.getText();
				System.out.println("툴 버튼이 눌러졌군요!!");
				System.out.println("당신이 사용하는 개발툴은 " + data2 + "군요.");
			}
		});
		button2.setForeground(new Color(165, 42, 42));
		button2.setBackground(Color.ORANGE);
		button2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 14));
		frame.getContentPane().add(button2);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	// 버튼을 누르면 실행되는 액션
				String data = text.getText();	// JTextField 변수로 받은 값을 가져오기
				System.out.println("과목 버튼이 눌러졌군요!!");
				System.out.println("당신의 주요 과목은 " + data + "군요.");
				
			}
		});

	
		frame.setVisible(true);//창 보여줘 (버튼 등 적용위해 맨 끝에 놓을것)
	}
}
