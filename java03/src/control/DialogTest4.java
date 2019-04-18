package control;

import javax.swing.JOptionPane;

//나와 동생의 나이를 비교해서
//내가 많거나 같으면 "내가 떡 2개를 먹어요"
//아니면, "동생이 떡 2개를 먹어요"
public class DialogTest4 {
	public static void main(String[] args) {
		int bro = Integer.parseInt(JOptionPane.showInputDialog("동생의 나이는?"));
		int me = Integer.parseInt(JOptionPane.showInputDialog("나의 나이는?"));
		if(me >= bro) {
			JOptionPane.showMessageDialog(null, "내가 떡 2개를 먹어요.");
		} else {
			JOptionPane.showMessageDialog(null, "동생이 떡 2개를 먹어요.");
		}
	}
}
