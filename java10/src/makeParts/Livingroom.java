package makeParts;

public class Livingroom {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.company = "사과";
		p1.shape = "네모";
		p1.size = 11;
		
		System.out.println(p1);
		
		String name = p1.call();
		System.out.println(name + "와 통화를 하다.");
		
		int time = p1.alarm();
		System.out.println(time + "시에 알람을 설정하다.");
	}
}
