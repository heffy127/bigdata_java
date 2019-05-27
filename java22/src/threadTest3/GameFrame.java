package threadTest3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GameFrame extends JFrame{
	JLabel label;
	JButton buttonImg;
	public class ThreadTimer extends Thread{
		public ThreadTimer() { }
		
		@Override
		public void run() {
			for (int i = 5000; i >= 0; i--) {
				String time = "park의 게임시작 : " + i;
				label.setText(time);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	
	public class ThreadShowImg extends Thread{
		ImageIcon[] imgs = new ImageIcon[12];
		
		String[] images = new String[] {
				"1.jpg","2.jpeg", "3.jpeg", "4.jpeg",
				"5.jpeg","6.jpg","7.jpeg","8.jpg","9.jpg",
				"10.jpeg","11.jpg","12.jpg"
		};
		public ThreadShowImg() {
			for (int i = 0; i < images.length; i++) {
				imgs[i] = new ImageIcon(images[i]);
			}
		}
		
		@Override
		public void run() {
			for (int i = 0; i < imgs.length; i++) {
				buttonImg.setIcon(imgs[i]);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public GameFrame() {
		setTitle("카운트 다운");
		setSize(629, 429);
		getContentPane().setLayout(null);
		
		label = new JLabel("New label");
		label.setFont(new Font("굴림", Font.PLAIN, 13));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(150, 32, 300, 15);
		getContentPane().add(label);
		
		buttonImg = new JButton("New button");
		buttonImg.setBounds(161, 72, 289, 290);
		getContentPane().add(buttonImg);
		
		ThreadTimer tt = new ThreadTimer();
		ThreadShowImg ts = new ThreadShowImg();
		tt.start();
		ts.start();
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GameFrame gf = new GameFrame();
		
	}
}
