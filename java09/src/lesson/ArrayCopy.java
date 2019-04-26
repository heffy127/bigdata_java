package lesson;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] num = {1, 2, 3};	// 배열(참조 <- 주소)
		int num2 = 100;	// 정수(기본 <- 값)
		
		// 기본형 변수의 복사
		int num3 = num2;
		System.out.println(num2);
		System.out.println(num3);
		
		// 배열의 복사(참조, 참조형 변수)
		int[] num4 = num;
		System.out.println(num[0]);
		System.out.println(num4[0]);
		
		num[0] = 555;
		System.out.println(num[0]);
		System.out.println(num4[0]);
		
		System.out.println("------------------");
		int[] num5 = num.clone();
		num[0] = 999;
		System.out.println(num[0]);
		System.out.println(num5[0]);
		
		int[] num6 = Arrays.copyOf(num, num.length);
		for(int n : num6)
			System.out.println(n);
	}
}
