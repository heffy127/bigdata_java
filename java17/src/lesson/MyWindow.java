package lesson;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow() {
		setTitle("나는 윈도우 프레임");
		setSize(500, 500);
		MyPanel mp = new MyPanel();
		add(mp);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow mw = new MyWindow();
	}
}
