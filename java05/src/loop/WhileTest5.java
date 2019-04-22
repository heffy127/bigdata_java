package loop;

public class WhileTest5 {
	public static void main(String[] args) {
		int num1 = 1;
		int mul = 1;
		System.out.println("n x s = n*s");
		while (num1 <= 9) {
			System.out.print(num1 + " x " + mul + " = ");
			mul *= num1;
			System.out.println(mul);
			num1++;
		}
		System.out.println("결과 : " + mul);
	}
}
