package array;

public class ArrayPractice2 {
	public static void main(String[] args) {
		int[] num = {444, 666, 777};
		// 배열의 첫 번째 값에 세 번째 값 넣기
		System.out.println(num[0] + "\t" + num[2] );
		num[0] = num[2];
		// 첫 번째 값 확인, 세 번째 값 확인
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}
