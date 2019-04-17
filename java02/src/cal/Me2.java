package cal;

import java.util.Scanner;

//당신의 취미는?
//평소 TV시청 시간은 얼마인가요?
//봄 여행을 다녀왔나요?
public class Me2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 취미는? ");
		String hobby = sc.next();
		System.out.print("평소 TV시청 시간은? ");
		int tvTime = sc.nextInt();
		System.out.print("봄 여행을 다녀왔나요? (true/false) ");
		boolean travel = sc.nextBoolean();
		System.out.println("==========");
		System.out.println("내 취미는 " + hobby + " 평소 TV를 " + tvTime + "시간도 보지 않아요.");
		System.out.println("봄 여행은 " + travel + "예요.");
		sc.close();
	}
}
