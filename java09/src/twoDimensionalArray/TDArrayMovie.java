package twoDimensionalArray;

import java.util.Scanner;

public class TDArrayMovie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] seat = new int[3][10];
		int end; int row; int col;
		
		while (true) {
			System.out.println("------------------------------------------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print("    " + (i + 1) + "열");
			}
			System.out.println();
			System.out.println("------------------------------------------------------------");
			
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + "행  ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "      ");
				}
				System.out.println();
			}
			
			System.out.print("** 종료 0   예약 1 ** >>");
			end = sc.nextInt();
			if (end == 0) {
				System.out.println("시스템 종료..");
				break;
			} else if(end == 1){
				System.out.print("행 입력 : ");
				row = sc.nextInt()-1;
				System.out.print("열 입력 : ");
				col = sc.nextInt()-1;
				if (seat[row][col] == 1) {
					System.out.println("이미 예약된 좌석입니다.\n");
					continue;
				} else {
					seat[row][col]++;
					System.out.println("좌석이 예약되었습니다.\n");
				}
			} else {
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}
		}
		sc.close();
	}
}
