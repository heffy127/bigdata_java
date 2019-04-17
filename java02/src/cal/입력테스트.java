package cal;

import java.util.Scanner;

public class 입력테스트 {	// 실무에서는 한글로 쓰지 말것
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.println("당신이 입력한 이름은 " + name + "입니다.");
		sc.close();
	}
}
