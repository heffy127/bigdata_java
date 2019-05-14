package mapLesson;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		Map cus = new HashMap();
		cus.put(100, "김데이");
		cus.put(200, "김사전");
		cus.put(300, "김구조");
		cus.put(400, "김자료");
		System.out.println(cus);
		System.out.println("200번 고객 탈퇴 300번 고객 개명");
		cus.remove(200);
		cus.put(300, "김충성");
		System.out.println(cus);
	}
}
