package collection;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		// 순서가 중요
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		int size = list.size();
		System.out.println("리스트의 개수는 " + size + "개");
		System.out.println(list);
		
		System.out.println("\n송스키 반칙으로 탈락");
		list.remove(1);
		size = list.size();
		System.out.println("리스트의 개수는 " + size + "개");
		System.out.println(list);
		list.add(1, "뉴인물");	// add 값 추가
		System.out.println(list);
		list.set(1, "올드인물");	// set 값 수정
		System.out.println(list);	
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
	}
}
