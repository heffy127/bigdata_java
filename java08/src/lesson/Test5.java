package lesson;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] want = new int[5];
		int select = -1;
		System.out.println("----------------------콘도 예약을 진행합니다.----------------------\n");
		while (true) {
			System.out.println("원하는 지역을 신청해주세요(각 지역은 2명까지 신청 가능)");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1) 강원도\t2) 전라도\t3) 파주\t4) 제주도\t5) 충청도");
			System.out.println("-----------------------------------------------------------------");
			for (int i : want)
				System.out.print(i + "\t\t");
			System.out.println();
			System.out.println("===================================");
			System.out.print("원하시는 지역코드를 입력하세요. (종료는 0)>> ");
			select = sc.nextInt();
			
			if(select == 0) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			} else if(want[select-1]==2) {
				System.out.println("이미 인원이 초과되어 신청이 불가능 합니다.");
				System.out.println("다른 지역을 신청해주세요.\n\n");
				continue;
			}
			
			want[select-1]++;
			System.out.println("신청 가능합니다.\n신청이 완료되었습니다.\n");
		}
	}
}
