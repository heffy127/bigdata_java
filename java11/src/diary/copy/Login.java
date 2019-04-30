package diary.copy;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login {
	private static JTextField textID;
	private static JTextField textPw;

	public static void main(String[] args) {
		Account ac = new Account();
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

		textID = new JTextField();
		textID.setBounds(144, 391, 87, 21);
		f.getContentPane().add(textID);
		textID.setColumns(10);

		textPw = new JTextField();
		textPw.setBounds(306, 391, 87, 21);
		f.getContentPane().add(textPw);
		textPw.setColumns(10);

		JButton buttonLogin = new JButton("로그인");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	// 접속
				if (textID.getText().equals(ac.id) && textPw.getText().equals(ac.pw)) {
					Diary diary = new Diary();
				} else { // 아이디 비밀번호 불일치시 창 뜨게
					JOptionPane.showMessageDialog(null, "아이디, 비밀번호를 다시 확인해주세요.");
				}
			}
		});
		buttonLogin.setBackground(new Color(0, 255, 255));
		buttonLogin.setBounds(189, 422, 97, 23);
		f.getContentPane().add(buttonLogin);

		f.setVisible(true);
	}
}
