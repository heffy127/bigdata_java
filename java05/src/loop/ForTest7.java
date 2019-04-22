package loop;

import java.util.Scanner;

public class ForTest7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num < 1 || num > 4) {
			System.out.print("계절[1-4]을 입력하세요 : ");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("계절은 봄입니다.");
			} else if (num == 2) {
				System.out.println("계절은 여름입니다.");
			} else if (num == 3) {
				System.out.println("계절은 가을입니다.");
			} else if (num == 4) {
				System.out.println("계절은 겨울입니다.");
			} else {
				System.out.println("범위내에서 다시 입력해주세요.");
			}
		}
		sc.close();
	}
}
