package lesson;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = { "김아무개", "박아무개", "송아무개", "정아무개", "장아무개" };
		int[] grade = { 1, 2, 3, 1, 1 };
		char[] credit = { 'A', 'B', 'C', 'A', 'B' };

		int[] gradeNum = new int[4];	// 학년 분포 저장하는 배열
		int[] creditNum = new int[5];	// 학점 분포 저장하는 배열
		char[] creditName = {'A', 'B', 'C', 'D', 'F'};

		String who = null;	// 입력받은 '찾을 사람' 저장하는 변수
		int here = 0;	// 사람 위치 저장하는 변수 (인덱스+1)
		
		
		System.out.println("동아리 명단의 이번학기 성적입니다.\n");
		System.out.println("이름\t\t학년\t\t학점");
		System.out.println("--------------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + grade[i] + "\t\t" + credit[i]);
		}
		System.out.println();

		System.out.println("학년 분포");
		for (int i = 0; i < grade.length; i++) {	// 학년 분포 저장
			gradeNum[grade[i] - 1]++;
		}
		for (int i = 0; i < gradeNum.length; i++) {	// 출력
			System.out.println((i + 1) + "학년 : " + gradeNum[i] + "명");
		}
		System.out.println();
		
		System.out.println("학점 분포");
		for (int i = 0; i < creditName.length; i++) {	// 학점 분포 저장
			for	 (int k = 0; k < credit.length; k++) {
				if(creditName[i] == credit[k])
					creditNum[i]++;
			}
		}
		
		for (int i = 0; i < creditNum.length; i++) {	// 출력
			System.out.println(creditName[i] + "학점 : " + creditNum[i] + "명");
		}
		System.out.println();
		
		System.out.print("위치를 찾고 싶은 이름 입력>> ");
		who = sc.next();
		for (int i = 0; i < name.length; i++) {
			if(name[i].equals(who)) {
				here = i+1;
			}	
		}
		System.out.println("입력한 이름 " + who + "의 위치는 " + here + "번째");
		System.out.println();
		
		System.out.print("정보를 알고 싶은 이름 입력>> ");
		who = sc.next();
		for (int i = 0; i < name.length; i++) {
			if(name[i].equals(who)) {
				here = i+1;
			}	
		}
		System.out.println("입력한 이름 " + who + "의 위치는 " + here + "번째");
		System.out.println("입력한 이름의 학년은 " + grade[here-1]);
		System.out.println("입력한 이름의 학점은 " + credit[here-1]);
		
		
		
	}
}
