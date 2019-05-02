package dbComponents;

import javax.swing.JOptionPane;

public class DBInsert2 {
	public static void main(String[] args) {

		int select = Integer.parseInt(JOptionPane.showInputDialog("입력(1) 수정(2) 삭제(3) : "));
		CRUDmodel ic = new CRUDmodel();
		if (select == 1) {
			String id = JOptionPane.showInputDialog("id입력 : ");
			String pw = JOptionPane.showInputDialog("pw입력 : ");
			String name = JOptionPane.showInputDialog("name입력 : ");
			String tel = JOptionPane.showInputDialog("tel입력 : ");

			ic.insert(id, pw, name, tel);
			JOptionPane.showMessageDialog(null, "입력 완료");

		} else if (select == 2) {
			String id = JOptionPane.showInputDialog("id입력 : ");
			String tel = JOptionPane.showInputDialog("변경할  tel 입력 : ");

			ic.update(id, tel);
			JOptionPane.showMessageDialog(null, "수정 완료");

		} else if (select == 3) {
			String id = JOptionPane.showInputDialog("id입력 : ");

			ic.delete(id);
			JOptionPane.showMessageDialog(null, "삭제 완료");

		}
	}
}
