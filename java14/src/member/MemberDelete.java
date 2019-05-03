package member;

import javax.swing.JOptionPane;

public class MemberDelete {
	public static void main(String[] args) {
		MemberDTO mdto = new MemberDTO();
		MemberDAO mdao = new MemberDAO();
		mdto.setTel(JOptionPane.showInputDialog("삭제할 계정 전화번호"));
		mdao.deleteMember(mdto);
	}
}
