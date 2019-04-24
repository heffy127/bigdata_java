package array;

import java.util.Scanner;

public class ArrayTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = {77, 99, 11, 66, 33};
		
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if(max<num[i])
				max = num[i];
		}
		
		System.out.println("배열 num");
		for (int i : num)
			System.out.print(i + "\t");
		System.out.println();
		System.out.println("최대값은 " + max);
		
		System.out.println();
		
		int temp = 0;
		int idx1=-1;
		int idx2=-1;
		
		for (int i = 0; i < num.length; i++) {	// 66과 99의 인덱스 값 찾기
			if(num[i]==66) {
				idx1 = i;
			} else if(num[i] == 99) {
				idx2 = i;
			}
		}
		
		
		temp = num[idx1];
		num[idx1] = num[idx2];
		num[idx2] = temp;
		
		for (int i : num)
			System.out.print(i + "\t");
		
		sc.close();
	}
}
