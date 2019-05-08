package collection;

import java.util.ArrayList;

public class BbsDAO {
	public ArrayList selectAll() {
		BbsDTO b1 = new BbsDTO("100", "java" , "fun.java", "java");
		BbsDTO b2 = new BbsDTO("200", "jsp" , "fun.jsp", "jsp");
		BbsDTO b3 = new BbsDTO("300", "spring" , "fun.spring", "spring");
		BbsDTO b4 = new BbsDTO("400", "android" , "fun.android", "android");
		
		ArrayList list = new ArrayList();
		list.add(b1);	// Object로 형변환 되어 들어감
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		return list;
		
	}
}
