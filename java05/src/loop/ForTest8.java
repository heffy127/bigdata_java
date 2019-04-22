package loop;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 수 입력 : ");
		int num3 = sc.nextInt();
		
		int result = num1 + num2 + num3;
		
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result);
		sc.close();
	}
}
