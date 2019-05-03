//package jdbc;
//
//import javax.swing.JOptionPane;
//
//import dbComponents.CRUDmodel;
//import dbComponents.MemberDTO;
//
//public class Search {
//	public static void main(String[] args) {
//		MemberDTO dto = new MemberDTO();
//		CRUDmodel db = new CRUDmodel();
//		dto.setName(JOptionPane.showInputDialog("이름입력"));
//		System.out.println(dto.getName());
//		String[] mem = db.select(dto);
//		for(String d : mem)
//			System.out.println(d);
//	}
//}
