package array;

import java.util.Scanner;

public class ArrayTest7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int[] occupy = new int[10];
		int cnt = 0;	// 좌석 예매 수 카운트
		int ticket = 10000;	// 티켓 값
		int sum = 0;	// 금액
		int select;

		for (int i = 0; i < seat.length; i++) {
			seat[i] = i + 1;
		}
		System.out.println("\t\t#$%\t\t영화 예매 프로그램\t\t%$#");
		System.out.println("\t\t\t\t 좌석 당 10000원\n");
		System.out.print("=========================================\n\t");

		for (int n : seat)	// 좌석 번호
			System.out.print(n + "\t");
		System.out.println();

		System.out.print("-------------------------------------------------------------------------\n\t");
		for (int m : occupy) {	// 좌석 점유 상황
			System.out.print(m + "\t");
		}
		System.out.println();

		while (true) {
			System.out.print("원하시는 좌석을 입력하세요. (종료 -1) : ");
			select = sc.nextInt();
			
			if(select == -1) {	// 종료
				System.out.println("이용해주셔서 감사합니다. ^^");
				break;
			} else if(occupy[select - 1] == 1) {	// 이미 점유된 좌석일때 다시 선택하도록 되돌림
				System.out.println("x 이미 예약된 좌석입니다. x\n");
				continue;
			}
			
			occupy[select - 1] = 1;	// 좌석 점유
			cnt++;
			sum += ticket;
			System.out.println("** 예약되었습니다. **");
			System.out.println();
			
			System.out.print("=========================================\n\t");

			for (int n : seat)	// 좌석 번호
				System.out.print(n + "\t");
			System.out.println();

			System.out.print("-------------------------------------------------------------------------\n\t");
			for (int m : occupy) {	// 좌석 점유 상황
				System.out.print(m + "\t");
			}
			System.out.println();
		}
		System.out.println("좌석 예매 수 : " + cnt + "석");
		System.out.print("예매하신 좌석 : ");
		for (int i = 0; i < occupy.length; i++) {
			if(occupy[i]==1)
				System.out.print((i+1) + "번\t");
		}
		System.out.println();
		System.out.println("총 금액 : " + sum + "원");

		sc.close();
	}
}
