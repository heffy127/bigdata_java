package array;

import java.util.Scanner;

public class ArrayTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("성적을 입력하시오:");
			score[i] = sc.nextInt();
		}
		
		int sum = 0;
		int avr = 0;
		for(int n : score) {
			sum += n;
		}
		avr = sum/score.length;
		System.out.println("평균 성적은 " + avr + "입니다");
		sc.close();
	}
}
