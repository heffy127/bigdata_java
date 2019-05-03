package member;

import javax.swing.JOptionPane;

public class MemberUseStamp {
	public static void main(String[] args) {
		MemberDAO mdao = new MemberDAO();
		MemberDTO mdto = new MemberDTO();
		mdto.setTel(JOptionPane.showInputDialog("전화번호"));
		mdao.UseStamp(mdto);
	}
}
