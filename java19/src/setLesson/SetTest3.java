package setLesson;

import java.util.HashSet;
import java.util.Set;

public class SetTest3 {
	public static void main(String[] args) {
		Set set1 = new HashSet();
		set1.add("사과");
		set1.add("우유");
		set1.add("바나나");
		Set set2 = new HashSet();
		set2.add("빵");
		set2.add("요플레");
		set2.add("아이스크림");
		set1.addAll(set2);
		System.out.println(set1);
		System.out.println(set2);
		set2.clear();
		System.out.println(set2);
	}
}
