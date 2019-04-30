package testParts;

public class Main {
	public static void main(String[] args) {
		Member m1 = new Member("admin","1234","관리자",1000);
		Member m2 = new Member("manager","pass","준관리자",1500);
		Member m3 = new Member("sitemanager","sitepass","준관리자",1800);
		
		int mileSum = m1.mileage + m2.mileage + m3.mileage;
		int mileavg = mileSum/3;
		
		System.out.println(m1.id + "의 비밀번호는 " + m1.pw + "입니다.");
		System.out.println(m2.id + "는 " + m2.position + "이고 마일리지는" + m2.mileage + "입니다.");
		System.out.println("총 마일리지는 " + mileSum + "입니다.");
		System.out.println("평균 마일리지는 " + mileavg + "입니다.");
	}
}
