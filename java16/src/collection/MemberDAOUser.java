package collection;

import java.util.ArrayList;

public class MemberDAOUser {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		MemberDAO dao = new MemberDAO();
		list = dao.selectAll();
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
