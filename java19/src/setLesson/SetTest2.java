package setLesson;

import java.util.HashSet;
import java.util.Set;

public class SetTest2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("디자이너");
		set.add("프로그래머");
		set.add("DB관리자");
		set.add("프로그래머");
		System.out.println(set);
	}
}
