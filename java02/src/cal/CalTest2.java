package cal;
//정수 400이 짝수인지 판별하세요 (나머지 연산자 사용)
public class CalTest2 {
	public static void main(String[] args) {
		int num = 400;
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("===삼항 연산자===");
		System.out.println((num%2==0 ? "짝수입니다." : "홀수입니다."));
	}
}
 