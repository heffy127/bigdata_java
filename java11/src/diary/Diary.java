package diary;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Diary {

	public Diary() {
		JFrame f = new JFrame("나의 일기장 작성 화면");
		f.setSize(500, 500);
		
		FlowLayout flow= new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel l = new JLabel("일기 작성 시작");
		f.add(l);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		Diary dia = new Diary();
	}
	
}
