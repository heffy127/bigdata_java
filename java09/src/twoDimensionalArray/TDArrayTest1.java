package twoDimensionalArray;

import java.util.Scanner;

public class TDArrayTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[2][];
		score[0] = new int[3];
		score[1] = new int[4];
		int sum = 0;
		int avr = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			avr = sum / score[i].length;
			System.out.println((i + 1) + "반 평균 : " + avr);
			sum = 0;
			avr = 0;
		}
		sc.close();
	}
}
