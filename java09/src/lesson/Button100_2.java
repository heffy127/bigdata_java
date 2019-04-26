package lesson;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button100_2 {
	public static void main(String[] args) {
		// 버튼 들어갈 자리 200개
		JButton[] bts = new JButton[200];
		for (int i = 0; i < bts.length; i++) {
			bts[i] = new JButton((i+1) + "번째 버튼");
		}
		
		JFrame f = new JFrame();
		f.setSize(1500, 850);
		f.setLayout(null);// 배치 부품 안쓰고 내가 직접 지정
		
		bts[0].setBounds(50, 50, 150, 100);
		f.add(bts[0]);
		bts[1].setBounds(200, 50, 150, 100);
		f.add(bts[1]);
		bts[2].setBounds(350, 50, 150, 100);
		f.add(bts[2]);
		bts[3].setBounds(500, 50, 150, 100);
		f.add(bts[3]);
		bts[4].setBounds(650, 50, 150, 100);
		f.add(bts[4]);
		
		f.setVisible(true);
	}
}
