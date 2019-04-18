package control;

import javax.swing.JOptionPane;

public class DialogTest2 {
	public static void main(String[] args) {
		String like = JOptionPane.showInputDialog("먹고 싶은 음식은 무엇입니까?");
		String hate = JOptionPane.showInputDialog("먹기 싫은 음식은 무엇입니까?");
		System.out.println("당신이 먹고 싶은 음식은 " + like + "이고 먹기 싫은 음식은 " + hate + "군요.");
	}
}
