package mathLesson;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.random());// 0~1사이의 랜덤값 생성
		System.out.println((int)( 1 + Math.random() * 8 ));// 1부터 8까지의 랜덤값 생성
		
		double num = 1234.5678;
		System.out.println(Math.ceil(num));	// 올림
		System.out.println(Math.floor(num)); // 내림
		System.out.println(Math.round(num)); // 반올림
		
		int num2 = -15;
		System.out.println(Math.abs(num2));// 절대값
		int num3 = -200;
		System.out.println(Math.max(num2, num3)); // 최대값 찾기 (인자 2개까지만 가능)
		System.out.println(Math.min(num2, num3)); // 최소값 찾기 (인자 2개까지만 가능)
		
		int num4 = 3;
		System.out.println(Math.pow(num4, 3));	// 제곱 구하기
		
		for(int i = 0 ; i < 5 ; i++) {
		Random rand = new Random(100);	// 씨드값을 인자로 전달
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		}
	}
}
