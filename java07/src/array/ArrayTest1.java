package array;

import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];
		for (int i = 0; i < str.length; i++) {
			System.out.print((i + 1) + " 번째 문자열을 입력하세요. : ");
			str[i] = sc.next();
		}
		
		String[] str2 = new String[2]; 
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("java")) {
				str2[0] = str[i];
			} else if(str[i].equals("spring")) {
				str2[1] = str[i];
			}
		}

		System.out.println("**" + str2[0] + "보다는 " + str[1] + "**");
		sc.close();
	}
}
