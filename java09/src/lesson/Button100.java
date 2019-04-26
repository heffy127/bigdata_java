package lesson;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button100 {
	public static void main(String[] args) {
		// 버튼 들어갈 자리 200개
		JButton[] bts = new JButton[200];
		for (int i = 0; i < bts.length; i++) {
			bts[i] = new JButton((i+1) + "번째 버튼");
		}
		
		JFrame f = new JFrame();
		f.setSize(1500, 850);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		for (int i = 0; i < bts.length; i++) {
			f.add(bts[i]);
		}
		
		f.setVisible(true);
	}
}
