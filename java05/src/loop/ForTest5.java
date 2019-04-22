package loop;

import java.util.Scanner;

public class ForTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 문자열 입력 : ");
		String s1 = sc.next();
		System.out.print("두 번째 문자열 입력 : ");
		String s2 = sc.next();
		System.out.println("＊＊" + s1 + " " + s2 + "＊＊");
		sc.close();
	}
}
