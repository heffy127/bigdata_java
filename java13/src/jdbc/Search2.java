//package jdbc;
//
//import javax.swing.JOptionPane;
//
//import dbComponents.CRUDmodel;
//import dbComponents.MemberDTO;
//
//public class Search2 {
//	public static void main(String[] args) {
//		CRUDmodel db = new CRUDmodel();
//		MemberDTO dto = new MemberDTO();
//		String id = JOptionPane.showInputDialog("이름입력");
//		String[] mem = db.select(dto);
//		
//		
//		JOptionPane.showMessageDialog(null, mem[0] + "   " + mem[1] + "   " + mem[2] + "   " + mem[3]);
//	}
//}
