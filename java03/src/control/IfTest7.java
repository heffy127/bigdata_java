package control;

import java.util.Random;
import java.util.Scanner;

// 숫자 추측 게임
public class IfTest7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int target = rand.nextInt(100);
		int cnt = 0;
		while (true) {
			System.out.print("당신이 생각한 숫자를 입력해주세요. : ");
			int myNum = sc.nextInt();
			cnt++;
			if (target == myNum) {
				System.out.println("정답입니다. ^^b");
				System.out.println("시도횟수 : " + cnt);
				break;
			} else {
				System.out.println("오답입니다.");
				if (target > myNum) {
					System.out.println("* 정답보다 작아요. *");
				} else {
					System.out.println("* 정답보다 커요. *");
				}
				System.out.println("다시 입력해주세요.");
			}
			System.out.println();
		} // while end.
	}	// main end.
}	// class end.
