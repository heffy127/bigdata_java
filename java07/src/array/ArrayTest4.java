package array;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = { 11, 22, 33, 44 };

		int idx = -1;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 33)
				idx = i;
		}

		System.out.println("배열 num");
		for (int n : num)
			System.out.print(n + "\t");

		System.out.println();

		if (idx == -1)
			System.out.println("33의 위치를 찾을 수 없습니다.");
		else
			System.out.println("33의 위치는 인덱스 " + idx + "번 입니다.");
		
		sc.close();
	}
}
