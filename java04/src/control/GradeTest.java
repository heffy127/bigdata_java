package control;

import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력해주세요 : ");
		String grade = sc.next();
		String eval = ""; 
		
		switch(grade.charAt(0)) {
		case 'A' :
		case 'a' :	
			eval = "최우수";
			break;
		case 'B' :
		case 'b' :	
			eval = "우수";
			break;
		case 'C' :
		case 'c' :	
			eval = "보통";
			break;
		default :
			eval = "낙제";
		}
		
		System.out.println("등급이 " + grade + "이면 " + eval + "입니다.");
	}
}
