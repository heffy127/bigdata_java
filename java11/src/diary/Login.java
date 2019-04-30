package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	
	public Login() { // 생성자이기 때문에 실행되면 자동 호출
		JFrame f = new JFrame("나의 일기장 로그인 화면");
		f.setSize(500, 500);
		
		FlowLayout flow= new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("diary.jpg");
		
		JButton button = new JButton("새창열기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Diary dia = new Diary();
			}
		});
		button.setBackground(Color.YELLOW);
		f.getContentPane().add(button);
		l.setIcon(icon);
		f.getContentPane().add(l);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		Login log = new Login();
	}
}
