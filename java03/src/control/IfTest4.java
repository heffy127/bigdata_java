package control;

import java.util.Scanner;

//두 수를 입력받으세요
//누가 더 큰지 판별하여 프린트

public class IfTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		while (true) {
			System.out.println("==============");
			System.out.println("두 수를 입력해주세요.(크기비교)");
			System.out.print("첫번째 수 : ");
			num1 = sc.nextInt();
			System.out.print("두번째 수 : ");
			num2 = sc.nextInt();
			System.out.println();
			if (num1 > num2) {
				System.out.println("num1에 입력된 " + num1 + "이(가) 더 큽니다.");
			} else if (num2 > num1) {
				System.out.println("num2에 입력된 " + num2 + "이(가) 더 큽니다.");
			} else {
				System.out.println("두 수는 같은 수 입니다.");
			}
			System.out.println();
		}

	}
}
