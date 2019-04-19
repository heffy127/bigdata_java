package window;
//각 연산 버튼을 눌러 계산
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFirstCal {
	private static JTextField textNum1;
	private static JTextField textNum2;
	public static void main(String[] args) {
		JFrame frame = new JFrame("계산기");
		frame.getContentPane().setBackground(new Color(153, 255, 255));
		frame.setSize(434, 375);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("*** 나의 계산기 ***");
		lblNewLabel_1.setFont(new Font("돋움", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Num1 ");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 28));
		frame.getContentPane().add(lblNewLabel);
		
		textNum1 = new JTextField();
		textNum1.setBackground(Color.YELLOW);
		textNum1.setForeground(new Color(0, 51, 255));
		textNum1.setFont(new Font("굴림", Font.PLAIN, 28));
		frame.getContentPane().add(textNum1);
		textNum1.setColumns(10);
		
		JLabel lblNum = new JLabel("Num2 ");
		lblNum.setForeground(new Color(204, 0, 153));
		lblNum.setFont(new Font("굴림", Font.PLAIN, 28));
		frame.getContentPane().add(lblNum);
		
		textNum2 = new JTextField();
		textNum2.setForeground(new Color(0, 51, 255));
		textNum2.setFont(new Font("굴림", Font.PLAIN, 28));
		textNum2.setColumns(10);
		textNum2.setBackground(Color.YELLOW);
		frame.getContentPane().add(textNum2);
		
		JButton buttonPlus = new JButton("덧셈");
		buttonPlus.setForeground(new Color(0, 0, 204));
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				System.out.println(num1 + num2);

			}
		});
		buttonPlus.setBackground(new Color(255, 255, 153));
		buttonPlus.setFont(new Font("굴림", Font.PLAIN, 27));
		frame.getContentPane().add(buttonPlus);
		
		JButton buttonMinus = new JButton("뺄셈");
		buttonMinus.setBackground(new Color(255, 255, 153));
		buttonMinus.setForeground(new Color(204, 0, 51));
		buttonMinus.setFont(new Font("굴림", Font.PLAIN, 27));
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				System.out.println(num1 - num2);
			}
		});
		frame.getContentPane().add(buttonMinus);
		
		JButton buttonMul = new JButton("곱셈");
		buttonMul.setBackground(new Color(255, 255, 153));
		buttonMul.setForeground(new Color(51, 153, 51));
		buttonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				System.out.println(num1 * num2);
			}
		});
		buttonMul.setFont(new Font("굴림", Font.PLAIN, 27));
		frame.getContentPane().add(buttonMul);
		
		JButton buttonDiv = new JButton("나눗셈");
		buttonDiv.setBackground(new Color(255, 255, 153));
		buttonDiv.setForeground(new Color(255, 102, 153));
		buttonDiv.setFont(new Font("굴림", Font.PLAIN, 27));
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				System.out.println(num1 / num2);
			}
		});
		frame.getContentPane().add(buttonDiv);

		
		frame.setVisible(true);
	}
}
