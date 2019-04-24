package array;

import java.util.Scanner;

public class ArrayTest8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] singer = new String[3];
		int[] vote = new int[singer.length];
		
		for (int i = 0; i < singer.length; i++) {
			System.out.print("가수 이름 입력>> ");
			singer[i] = sc.next();
		}
		
		for(String s : singer)
			System.out.print(s + "\t");
		System.out.println();
		
		System.out.println("총 6회 투표\n");
		for(int i = 0; i < 6 ; i++) {
			int num = 0;
			System.out.println("1) " + singer[0] + " 2) " + singer[1] + " 3) " + singer[2] );
			System.out.print("투표번호>> ");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				vote[0]++;
				break;
			case 2 :
				vote[1]++;
				break;
			case 3 :
				vote[2]++;
				break;
			default :
				System.out.println("잘못된 번호 입력\n");
				i--;
				continue;
			}
			System.out.println();
		}
		System.out.println(singer[0] + " : " + vote[0]);
		System.out.println(singer[1] + " : " + vote[1]);
		System.out.println(singer[2] + " : " + vote[2]);
		
		sc.close();
	}
}
