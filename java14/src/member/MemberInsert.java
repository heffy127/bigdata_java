package member;

import javax.swing.JOptionPane;

public class MemberInsert {
	public static void main(String[] args) {
		MemberDAO mdao = new MemberDAO();
		MemberDTO mdto = new MemberDTO();
		mdto.setName(JOptionPane.showInputDialog("이름"));
		mdto.setTel(JOptionPane.showInputDialog("전화번호"));
		mdao.insertMember(mdto);
	}
}
