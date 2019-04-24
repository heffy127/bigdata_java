package array;

import java.util.Scanner;

public class ScannerArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1) + "번째 정수 값 입력 : ");
			num[i] = sc.nextInt();
		}
		
		for(int i : num)
			System.out.println(i);
		
		sc.close();
	}
}
