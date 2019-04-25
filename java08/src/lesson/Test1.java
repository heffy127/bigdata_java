package lesson;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] register = new int[5];
		int select = -1;
		while (select != 0) {	// 종료
			System.out.println("수강 신청을 진행합니다.");
			System.out.println("원하는 과목을 신청해주세요.");
			while (true) {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("1) 자바\t2) 스프링\t3) 안드로이드  4) 파이썬\t5) 제이쿼리)");
				System.out.println("-----------------------------------------------------------------------");
				for (int i : register)
					System.out.print(i + "\t\t  ");
				System.out.println();
				System.out.print("원하는 과목코드를 입력해주세요.(종료 0) ==>");
				 select = sc.nextInt();

				if (select == 0) { // 종료
					System.out.println("신청을 종료합니다.\n안녕히가세요.");
					break;
				} else if (register[select - 1] == 1) {
					System.out.println("신청이 불가능 합니다.\n다른 코드 번호를 입력해주세요.");
					continue;	// 신청 불가능 할 때 두번째 while부터 재실행
				} else {
					register[select - 1]++;
					System.out.println("신청이 완료되었습니다.");
					break;	// 첫 번째 while부터 재실행
				}
			}
		}
	}
}
