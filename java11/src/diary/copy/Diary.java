package diary.copy;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Diary {
	
	private static JTextField textDate;
	private static JTextField textTitle;
	public Diary() {
		JFrame f = new JFrame("일기 작성");
		f.getContentPane().setBackground(new Color(255, 250, 205));
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 15));
		f.setSize(500, 650);
		f.getContentPane().setLayout(null);
		
		textDate = new JTextField();
		textDate.setBounds(258, 42, 116, 21);
		f.getContentPane().add(textDate);
		textDate.setColumns(10);
		
		textTitle = new JTextField();
		textTitle.setBounds(258, 73, 116, 21);
		f.getContentPane().add(textTitle);
		textTitle.setColumns(10);
		
		JLabel labelDate = new JLabel("<<<일기작성날짜>>>");
		labelDate.setForeground(new Color(25, 25, 112));
		labelDate.setFont(new Font("굴림", Font.BOLD, 14));
		labelDate.setBounds(82, 42, 164, 21);
		f.getContentPane().add(labelDate);
		
		JLabel labelTitle = new JLabel("<<<일기작성제목>>>");
		labelTitle.setForeground(new Color(128, 0, 0));
		labelTitle.setFont(new Font("굴림", Font.BOLD, 14));
		labelTitle.setBounds(82, 76, 164, 21);
		f.getContentPane().add(labelTitle);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 16));
		textArea.setBounds(39, 118, 393, 409);
		f.getContentPane().add(textArea);
		
		JButton button = new JButton("파일에 저장하기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	// 예외 처리
					FileWriter w = new FileWriter(textDate.getText());
					w.write(textTitle.getText() + "\n\n");
					w.write(textArea.getText());
					w.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(176, 537, 131, 33);
		f.getContentPane().add(button);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) throws Exception {
		Diary diary = new Diary();
	}
}
