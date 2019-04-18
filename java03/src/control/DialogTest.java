package control;

import javax.swing.JOptionPane;

public class DialogTest {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "내가 바로 다이얼로그");
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요."); // sc.next()와 같은 기능
		System.out.println("당신의 이름은 : " + name);
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요."); // sc.next()와 같은 기능
		int data = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, "내년 저의 나이는 " + (data+1) + "세 입니다.");
	}
}
