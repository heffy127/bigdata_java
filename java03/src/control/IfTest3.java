package control;

import java.util.Scanner;
//저기요!!
//-----------
//메뉴를 고르세요.
//-----------
//1)짜장면	2)짬뽕		3)우동
//-----------
//당신의 선택은? 1
//당신은 짜장면을 주문하셨습니다.

public class IfTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저기요!!!");
		System.out.println("---------------------");
		System.out.println("메뉴를 고르세요.");

		while (true) {
			System.out.println("---------------------");
			System.out.println("1) 짜장면    2) 짬뽕    3) 우동");
			System.out.println("---------------------");
			System.out.print("당신의 선택은 ? ");
			int food = sc.nextInt();
			if (food == 1) {
				System.out.println("당신은 짜장면을 주문하셨습니다.");
			} else if (food == 2) {
				System.out.println("당신은 짬뽕을 주문하셨습니다.");
			} else if (food == 3) {
				System.out.println("당신은 우동을 주문하셨습니다.");
			} else {
				System.out.println("다시 선택해주세요. 없는 메뉴입니다.");
			}
			System.out.println();
		}	// while end.
	}	// main end.
}	// class end.
