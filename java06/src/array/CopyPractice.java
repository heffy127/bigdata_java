package array;

public class CopyPractice {
	public static void main(String[] args) {
		int num1 = 300;
		int num2 = 100;
		// num3에 num1값을 복사
		int num3 = num1;
		System.out.println(num3);
		// num2에 num3값을 복사
		num2 = num3;
		System.out.println("num1 = " + num1 + " num2 = " + num2 + " num3 = " + num3);
	}
}
