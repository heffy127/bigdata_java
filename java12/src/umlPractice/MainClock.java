package umlPractice;

public class MainClock {
	public static void main(String[] args) {
		Clock c1 = new Clock(15000, "고급시계", 18, "알마니");
		Clock c2 = new Clock(10000, 14, "카시오");
		Clock c3 = new Clock(8000, "샤오미");
		
		System.out.println(c1.getCompnay() + "\t" + c1.getPrice());
		System.out.println(c2.getCompnay() + "\t" + c2.getPrice());
		System.out.println(c3.getCompnay() + "\t" + c3.getPrice());
	}
}
