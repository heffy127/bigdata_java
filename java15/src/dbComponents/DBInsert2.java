package dbComponents;

import javax.swing.JOptionPane;

public class DBInsert2 {
	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO();
		int select = Integer.parseInt(JOptionPane.showInputDialog("입력(1) 수정(2) 삭제(3) 조회(4): "));
		MemberDAO ic = new MemberDAO();
		if (select == 1) {
			 dto.setId(JOptionPane.showInputDialog("id입력 : "));
			dto.setPw(JOptionPane.showInputDialog("pw입력 : "));
			dto.setName(JOptionPane.showInputDialog("name입력 : "));
			dto.setTel(JOptionPane.showInputDialog("tel입력 : "));

			ic.insert(dto);
			JOptionPane.showMessageDialog(null, "입력 완료");

		} else if (select == 2) {
			dto.setId(JOptionPane.showInputDialog("id입력 : "));
			dto.setTel(JOptionPane.showInputDialog("새로운 tel입력 : "));

			ic.update(dto);
			JOptionPane.showMessageDialog(null, "수정 완료");

		} else if (select == 3) {
			dto.setId(JOptionPane.showInputDialog("id입력 : "));

			ic.delete(dto);
			JOptionPane.showMessageDialog(null, "삭제 완료");

		} else if (select == 4) {
			dto.setId(JOptionPane.showInputDialog("id입력 : "));
			
			MemberDTO sdto = ic.select(dto);
			System.out.println(sdto.getId());
			System.out.println(sdto.getPw());
			System.out.println(sdto.getName());
			System.out.println(sdto.getTel());
			
		}
	}
}
