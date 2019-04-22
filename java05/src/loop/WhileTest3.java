package loop;
//두 개의 입력 값을 받아서,
//첫 번째 값부터 두 번째 값까지 더함
public class WhileTest3 {
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 20;
		int sum = 0;
		while(num1 <= num2) {
			sum += num1;
			num1++;
		}
		System.out.println("num1부터 num2까지 더한 값 : " + sum);
	}
}
