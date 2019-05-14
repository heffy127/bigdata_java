package packageSame;

public class MemberUser {
	public static void main(String[] args) {
		Member mem = new Member();	// 같은 패키지는 import 불필요
		mem.age = 100;	// default = 같은 package 접근 가능
		mem.name = "park";
		mem.salary = 300;
		// mem.ssn = "100101";
	}
}
