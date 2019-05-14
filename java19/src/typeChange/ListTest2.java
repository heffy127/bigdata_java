package typeChange;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 스트링");	// String(자식) -> Object(부모) UpCating
		list.add(100);	// Integer(자식) -> Object(부모) UpCasting
		System.out.println(list);
		
					// 강제 형변환
		String name = (String)list.get(0);	// Object(부모) -> String(자식) DownCasting
	}
}
