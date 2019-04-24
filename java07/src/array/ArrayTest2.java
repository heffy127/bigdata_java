package array;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + " 번째 정수를 입력하세요. : ");
			num[i] = sc.nextInt();
		}
		
		int[] num2 = new int[2]; 
		for (int i = 0; i < num.length; i++) {
			if(num[i]==(100)) {
				num2[0] = num[i];
			} else if(num[i]==(300)) {
				num2[1] = num[i];
			}
		}
		
		System.out.println(num2[0] + " + " + num2[1] + "은 " + (num2[0]+num2[1]) + "입니다.");
		sc.close();
	}
}
