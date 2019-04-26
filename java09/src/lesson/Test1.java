package lesson;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Test1 {
	static int idx = 0;

	public static void main(String[] args) {
		String[] photos = { "6.png", "7.png", "8.png", "9.png" };

		JFrame f = new JFrame();
		f.setSize(410, 766);
		f.getContentPane().setLayout(null);

		JButton buttonIcon = new JButton("New button");
		buttonIcon.setBounds(33, 104, 326, 613);
		f.getContentPane().add(buttonIcon);

		ImageIcon icon = new ImageIcon(photos[0]);
		buttonIcon.setIcon(icon);

		JButton buttonLeft = new JButton("왼쪽으로");
		buttonLeft.setForeground(Color.WHITE);
		buttonLeft.setBackground(Color.RED);
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (idx == 0) {
					JOptionPane.showConfirmDialog(null, "마지막 사진입니다.");
				} else {
					ImageIcon icon = new ImageIcon(photos[--idx]);
					buttonIcon.setIcon(icon);
				}
			}
		});
		buttonLeft.setBounds(44, 47, 130, 47);
		f.getContentPane().add(buttonLeft);

		JButton buttonRight = new JButton("오른쪽으로");
		buttonRight.setForeground(Color.WHITE);
		buttonRight.setBackground(Color.BLUE);
		buttonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (idx == 3) {
					JOptionPane.showMessageDialog(null, "마지막 사진입니다.");
				} else {
					ImageIcon icon = new ImageIcon(photos[++idx]);
					buttonIcon.setIcon(icon);
				}
			}
		});
		buttonRight.setBounds(207, 47, 138, 47);
		f.getContentPane().add(buttonRight);

		f.setVisible(true);
	}
}
