package array;

import java.util.Scanner;

public class ArrayTest9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = {"김연아", "유재석", "손흥민"};
		int[] java = {85, 77, 100};
		int[] spring = {90, 88, 99};
		int max = 0;
		int maxIdx = 0;	// 가장 큰 점수의 인덱스 따로 저장
		int min = 0;
		int minIdx = 0;		// 가장 작은 점수의 인덱스 따로 저장
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("학생이름 : " + name[i]);
			System.out.println("학생점수(자바) : " + java[i]);
			System.out.println("학생점수(스프링) : " + spring[i]);
			System.out.println();
		}
		System.out.println("=====================");
		System.out.print("세 학생의 이름은 ");
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
			if(i == name.length-1)
				break;
			System.out.print(", ");
		}
		System.out.println();
		
		max = java[0];
		for (int i = 1; i < java.length; i++) {
			if(max<java[i]) {
				max = java[i];
				maxIdx = i;
			}
		}
		
		min = spring[0];
		for (int i = 1; i < spring.length; i++) {
			if(min>spring[i]) {
				min = spring[i];
				minIdx = i;
			}
			
		}

		System.out.println("학생 점수 중 제일 높은 자바 점수는 " + max + "(" + name[maxIdx] + ")");
		System.out.println("학생 점수 중 제일 낮은 스프링 점수는 " + min + "(" + name[minIdx] + ")");
		
		sc.close();
	}
}
