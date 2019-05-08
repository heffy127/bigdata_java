package collection;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MemberDAO {
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		
		for(int i = 1 ; i <= 3 ; i++) {
			MemberDTO dto = new MemberDTO();
			dto.setId(JOptionPane.showInputDialog(i +"/3 id입력"));
			dto.setPw(JOptionPane.showInputDialog(i +"/3 pw입력"));
			dto.setName(JOptionPane.showInputDialog(i +"/3 name입력"));
			dto.setTel(JOptionPane.showInputDialog(i +"/3 tel입력"));
			list.add(dto);
		}
		return list;
	}
}
