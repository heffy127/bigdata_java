package array;

public class ArrayPractice3 {
	public static void main(String[] args) {
		int[] num1 = {1,2,3};
		int[] num2 = num1;	// num1의 '주소값'을 복사
		num2[0] = 9;
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
	}
}
