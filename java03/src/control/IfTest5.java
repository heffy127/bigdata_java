package control;

import java.util.Scanner;

// 두 수를 입력받으세요
//4칙 연산을 하세요 (+,-,*,/)
public class IfTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		while (true) {
			System.out.println("==============");
			System.out.println("두 수를 입력해주세요.(사칙연산)");
			System.out.print("첫번째 수 : ");
			num1 = sc.nextInt();
			System.out.print("두번째 수 : ");
			num2 = sc.nextInt();
			System.out.println();
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			System.out.println(num1 + " X " + num2 + " = " + (num1*num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			System.out.println();
		}

	}
}
