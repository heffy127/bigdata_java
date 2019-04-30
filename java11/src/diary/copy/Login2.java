package diary.copy;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login2 {
	
	private static JTextField textField;
	private static JTextField textField_1;
	public Login2(){
		JFrame f = new JFrame("로그인 화면");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel labelImage = new JLabel("New label");
		labelImage.setBounds(72, 27, 350, 350);
		f.getContentPane().add(labelImage);
		
		ImageIcon icon = new ImageIcon("diary.jpg");
		labelImage.setIcon(icon);
		
		JLabel labelID = new JLabel("ID입력:");
		labelID.setBounds(93, 394, 57, 15);
		f.getContentPane().add(labelID);
		
		JLabel labelPW = new JLabel("PW입력:");
		labelPW.setBounds(254, 394, 57, 15);
		f.getContentPane().add(labelPW);
		
		textField = new JTextField();
		textField.setBounds(144, 391, 87, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(306, 391, 87, 21);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton buttonLogin = new JButton("로그인");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Diary diary = new Diary();
			}
		});
		buttonLogin.setBackground(new Color(0, 255, 255));
		buttonLogin.setBounds(189, 422, 97, 23);
		f.getContentPane().add(buttonLogin);
		
		
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		Login2 log2 = new Login2();
	}
}
