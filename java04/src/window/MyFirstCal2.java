package window;
//연산자를 텍스트로 입력받아
//계산 버튼 하나로 계산

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MyFirstCal2 {
	private static JTextField textNum1;
	private static JTextField textNum2;
	private static JTextField textCal;
	public static void main(String[] args) {
		JFrame	frame = new JFrame();
		frame.setSize(400, 300);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("*** 나의 계산기2 ***");
		label.setFont(new Font("굴림", Font.BOLD, 34));
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("숫자1 ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 32));
		frame.getContentPane().add(lblNewLabel);
		
		textNum1 = new JTextField();
		textNum1.setFont(new Font("굴림", Font.PLAIN, 30));
		frame.getContentPane().add(textNum1);
		textNum1.setColumns(10);
		
		JLabel label_1 = new JLabel("숫자2 ");
		label_1.setFont(new Font("굴림", Font.PLAIN, 32));
		frame.getContentPane().add(label_1);
		
		textNum2 = new JTextField();
		textNum2.setFont(new Font("굴림", Font.PLAIN, 30));
		textNum2.setColumns(10);
		frame.getContentPane().add(textNum2);
		
		JLabel label_2 = new JLabel("연산자");
		label_2.setForeground(new Color(255, 153, 0));
		label_2.setFont(new Font("굴림", Font.PLAIN, 32));
		frame.getContentPane().add(label_2);
		
		textCal = new JTextField();
		textCal.setBackground(new Color(255, 255, 204));
		textCal.setFont(new Font("굴림", Font.PLAIN, 30));
		textCal.setColumns(10);
		frame.getContentPane().add(textCal);
		
		JButton buttonCal = new JButton("@ 계산 @");
		buttonCal.setBackground(new Color(153, 255, 255));
		buttonCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				String cal = textCal.getText();
				if(cal.equals("+")) {
					System.out.println(num1+num2);
				}else if(cal.equals("-")) {
					System.out.println(num1-num2);
				}else if(cal.equals("*")) {
					System.out.println(num1*num2);
				}else if(cal.equals("/")) {
					System.out.println(num1/num2);
				}else {
					System.out.println("잘못된 연산자 입력");
				}
			}
		});
		
		buttonCal.setFont(new Font("굴림", Font.BOLD, 20));
		frame.getContentPane().add(buttonCal);
		
		frame.setVisible(true);
		
	}
}
