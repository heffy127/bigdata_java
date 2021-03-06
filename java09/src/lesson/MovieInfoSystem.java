package lesson;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// 자바는 필요한 부품(class)를 복사한 후
// 이를 조립해서 코딩하는 방식
//	부품(객체, 대상) 조립식 프로그램
// 객체지향형 프로그램(Object Oriented Program, OOP)
public class MovieInfoSystem {
	public static void main(String[] args) {
		String[] movies = {"1.PNG","2.PNG","3.PNG","4.PNG","5.PNG"};
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화 정보 시스템");
		f.setSize(300, 600);
		// 물흐르듯이 하나씩 순서대로 붙여주는 클래스
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		JButton img = new JButton();
		f.getContentPane().add(img);

		ImageIcon icon = new ImageIcon("1.PNG"); // 이미지 가져오기
		img.setIcon(icon);	// 버튼에 이미지 삽입
		
		JButton b1 = new JButton("<<< 생일 >>>");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon(movies[0]);
				img.setIcon(icon);
			}
		});
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.RED);
		b1.setFont(new Font("나눔고딕", Font.BOLD, 21));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("<< 헬보이 >>");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[1]);
				img.setIcon(icon);
			}
		});
		b2.setBackground(Color.YELLOW);
		b2.setForeground(Color.RED);
		b2.setFont(new Font("나눔고딕", Font.BOLD, 21));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("< 돈(money) >");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[2]);
				img.setIcon(icon);
			}
		});
		b3.setBackground(Color.YELLOW);
		b3.setForeground(Color.RED);
		b3.setFont(new Font("나눔고딕", Font.BOLD, 21));
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("<< 파이브피트 >>");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[3]);
				img.setIcon(icon);
			}
		});
		b4.setBackground(Color.YELLOW);
		b4.setForeground(Color.RED);
		b4.setFont(new Font("나눔고딕", Font.BOLD, 21));
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("<<< 어스 >>>");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[4]);
				img.setIcon(icon);
			}
		});
		b5.setBackground(Color.YELLOW);
		b5.setForeground(Color.RED);
		b5.setFont(new Font("나눔고딕", Font.BOLD, 21));
		f.getContentPane().add(b5);
		// 객체화
		// URL url = new URL("http://www.naver.com");
		// File file = new File("c:/temp/test.txt");
		// SQL sql = new SQL("select * from member")'

		f.setVisible(true);
	}
}
