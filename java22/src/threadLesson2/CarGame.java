package threadLesson2;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	public class CarThread extends Thread { // 내부 클래스

		int x, y;
		ImageIcon icon;
		JLabel label;

		public CarThread(String fileName, int x, int y) {
			this.x = x;
			this.y = y;
			icon = new ImageIcon(fileName);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
		}

		@Override
		public void run() {
			for (int i = 0; i < 600; i++) {
				Random rand = new Random();
				x += rand.nextInt(50);
				label.setBounds(x, y, 100, 100);		
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public CarGame() {
		setTitle("나의 스레드 자동차 프로그램");
		setSize(600, 500);

		CarThread car1 = new CarThread("car1.gif", 100, 0);
		CarThread car2 = new CarThread("car2.gif", 100, 125);
		CarThread car3 = new CarThread("car3.gif", 100, 300);

		car1.start();
		car2.start();
		car3.start();

		setVisible(true);
	}

	public static void main(String[] args) {
		CarGame car = new CarGame();

	}

}
