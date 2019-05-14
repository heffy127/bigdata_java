package mapLesson;

import java.util.HashMap;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args) {
		Map memberlist = new HashMap();
		Member m1 = new Member("hong", 19, '여', "구로", "011");
		Member m2 = new Member("na", 19, '여', "관악", "017");
		Member m3 = new Member("park", 26, '남', "서대문", "019");
		memberlist.put("m100", m1);
		memberlist.put("m200", m2);
		memberlist.put("m300", m3);
		System.out.println(memberlist.get("m100"));
		System.out.println(memberlist.get("m200"));
		System.out.println(memberlist.get("m300"));
	}
}
