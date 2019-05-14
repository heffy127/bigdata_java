package packageTest;

import packageSame.Member;

public class MemberUser2 {
	public static void main(String[] args) {
		Member mem = new Member();
		mem.name = "kim";	// 다른 패키지에서는 public만 보임
	}
}
