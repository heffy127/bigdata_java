package loop;

public class ForTest1 {
	int test;	// 전역(global)변수
	
	public static void main(String[] args) {
		//	for(	초기값		;	조건식		;	증감식	) {
		int sum = 0;	// main 메소드의 지역(local)변수
		int start;
		for (start = 1 ; start <= 10 ; start++ ) {
			sum += start;
		}
		System.out.println("1부터 10까지의 합은 : " + sum );
	}
}
