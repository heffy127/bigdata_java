package lesson;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] num = {33, 66, 44, 22, 11, 77, 99};
		Arrays.sort(num, 0, num.length);
		for(int n : num)
			System.out.println(n);
	}
}
