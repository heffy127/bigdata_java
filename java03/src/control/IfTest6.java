package control;

import java.util.Scanner;
/*
 * 입력값을 받아서, 학점계산
 * 90점 이상 A
 * 80점 이상 B
 * 70점 이상 C
 * 60점 이상 D
 * 아니면 F
 */
public class IfTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 점수 입력 : ");
		int jumsu = sc.nextInt();
		String result;
		if(jumsu>=90) {
			result = "A";
		} else if (jumsu>=80) {
			result = "B";
		}else if (jumsu>=70) {
			result = "C";
		} else if (jumsu>=60) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println("당신의 학점은 " + result + "입니다.");
	}
}
