package array;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] score = { 44, 66, 22, 88 };

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println();

		System.out.println(score.length);

		score[0] = 55;

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}

	}
}
