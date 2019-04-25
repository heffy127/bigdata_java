package lesson;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = new String[5];
		String[] temp = new String[2];	// split로 분리한 문자열을 임시로 저장
		String[] name = new String[5];
		int[] age = new int[5];
		int sum = 0;	// 나이 합
		double ageAvr = 0;	// 나이 평균
		System.out.println("이름과 나이를 입력하세요.");
		for (int i = 0; i < name.length; i++) {
			System.out.print("입력>>>> ");
			input[i] = sc.nextLine();
			temp = input[i].split(" ");		// " "을 기준으로 문자열을 분리한 후 반환
			name[i] = temp[0];
			age[i] = Integer.parseInt(temp[1]);
		}
		
		for(int a : age)
			sum += a;
		ageAvr = sum/age.length;
		
		System.out.println("전체 인원수는 " + name.length + "명");
		System.out.println("파티 참석자 전체 명단입니다.");
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름은 : " + name[i] + ", 나이는 : " + age[i]);
		}
		System.out.println("파티 참석자 나이의 평균은 " + ageAvr + "세");
		

	}
}
