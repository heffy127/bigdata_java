package lesson;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button100_3 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		// 버튼 들어갈 자리 200개
		JButton[] bts = new JButton[200];
		for (int i = 0; i < bts.length; i++) {
			bts[i] = new JButton((i+1) + "번째 버튼");
		}
		
		JFrame f = new JFrame();
		f.setSize(1500, 850);
		f.setLayout(null);// 배치 부품 안쓰고 내가 직접 지정
		
		for (int i = 0; i < bts.length; i++) {
			int x = rand.nextInt(1400);
			int y = rand.nextInt(800);
			bts[i].setBounds(x, y, 150, 50);
			f.add(bts[i]);
		}
		
		f.setVisible(true);
	}
}
