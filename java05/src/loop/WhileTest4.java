package loop;

import javax.swing.JOptionPane;

//두 개의 입력 값을 받아서,
//첫 번째 값부터 두 번째 값까지 더함
public class WhileTest4 {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("첫 번째 값 입력 : "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("두 번째 값 입력 : "));
		int sum = 0;
		while(num1 <= num2) {
			sum += num1;
			num1++;
		}
		JOptionPane.showMessageDialog(null, "첫 번째 값 + 두 번째 값 = " + sum);
	}
}
