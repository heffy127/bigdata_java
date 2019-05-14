package listTest;

import java.util.ArrayList;

public class ListTest1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		System.out.println(list);
		System.out.println("2등이 반칙으로 탈락");
		list.remove(1);
		System.out.println(list);
	}
}
