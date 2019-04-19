package control;

import java.util.Random;
import java.util.Scanner;

public class RSPTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보(2)");
		System.out.print("내고 싶은 걸 숫자로 입력하세요 : ");
		int me = sc.nextInt();
		Random rand = new Random();
		int com = rand.nextInt(3);
		int result = me - com;
		
		System.out.println("내가 낸것 : " + me);
		System.out.println("컴퓨터가 낸것 : " + com);
		
		if(result == -1 || result == 2) {
			System.out.println("내가 졌습니다 ㅠㅠ");
		} else if(result == -2 || result == 1) {
			System.out.println("이겼습니다 ^^");
		} else {
			System.out.println("비겼습니다.");
		}
	}
}
