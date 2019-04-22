package loop;

// 1부터 10까지 더하기
public class WhileTest2 {
	public static void main(String[] args) {
		int start = 1; // 초기값
		int sum = 0; // 0 대입 않고 선언만 하면 쓰레기값 저장
		while (start <= 10) { // 조건식
			sum += start;
			start++; // 증감식
		}
		System.out.println(sum);
	}
}
