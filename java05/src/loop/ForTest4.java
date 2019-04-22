package loop;

import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별 갯수를 입력하세요 : ");
		int star = sc.nextInt();
		for(int i = 0; i < star ; i++) {
			System.out.print("★");
		}
		sc.close();
	}
}
