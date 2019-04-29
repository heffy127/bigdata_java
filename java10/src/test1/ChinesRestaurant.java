package test1;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChinesRestaurant {
	private static JTextField textCount;
	private static JTextField textPrice;
	public static void main(String[] args) {
		Number n = new Number();
		FoodJajang jj = new FoodJajang();
		FoodJjambbong jb = new FoodJjambbong();
		FoodUdong ud = new FoodUdong();
		
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(491, 500);
		f.getContentPane().setLayout(null);
		f.setTitle("주문하세요");
		
		
		JLabel labelCount = new JLabel("개수");
		labelCount.setBounds(241, 21, 34, 18);
		f.getContentPane().add(labelCount);
		
		textCount = new JTextField();
		textCount.setBounds(270, 20, 48, 21);
		f.getContentPane().add(textCount);
		textCount.setColumns(10);
		
		JLabel label = new JLabel("금액");
		label.setBounds(330, 23, 34, 15);
		f.getContentPane().add(label);
		
		textPrice = new JTextField();
		textPrice.setBounds(356, 20, 101, 21);
		f.getContentPane().add(textPrice);
		textPrice.setColumns(10);
		
		textCount.setText(String.valueOf(n.cnt));
		textPrice.setText(String.valueOf(n.sum));
		
		JButton buttonIcon = new JButton("New button");
		buttonIcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonIcon.setBounds(25, 60, 432, 391);
		f.getContentPane().add(buttonIcon);
		
		ImageIcon icon = new ImageIcon("restaurant.jpg");
		buttonIcon.setIcon(icon);
		
		JButton button1 = new JButton("짬뽕");
		button1.setForeground(new Color(240, 248, 255));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon(jb.icon);
				buttonIcon.setIcon(icon);
				textCount.setText(String.valueOf(++n.cnt));
				textPrice.setText(String.valueOf(n.sum+=jb.price));
			}
		});
		button1.setBackground(new Color(220, 20, 60));
		button1.setBounds(25, 10, 60, 40);
		f.getContentPane().add(button1);
		
		JButton button2 = new JButton("우동");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(ud.icon);
				buttonIcon.setIcon(icon);
				textCount.setText(String.valueOf(++n.cnt));
				textPrice.setText(String.valueOf(n.sum+=ud.price));
			}
		});
		button2.setBackground(Color.ORANGE);
		button2.setBounds(97, 10, 60, 40);
		f.getContentPane().add(button2);
		
		JButton button3 = new JButton("짜장");
		button3.setForeground(new Color(240, 248, 255));
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(jj.icon);
				buttonIcon.setIcon(icon);
				textCount.setText(String.valueOf(++n.cnt));
				textPrice.setText(String.valueOf(n.sum+=jj.price));
			}
		});
		button3.setBackground(new Color(128, 0, 0));
		button3.setBounds(169, 10, 60, 40);
		f.getContentPane().add(button3);

		
		
		f.setVisible(true);
		
	}
}
