package twoDimensionalArray;

public class TDArray1 {
	public static void main(String[] args) {
		// 배열을 만들 때
		// 초기값을 지정하지 않는 경우
		int[][] seat = new int[3][10];

		// 초기값을 지정하는 경우
		int[][] num = { { 1, 2 }, { 4, 5, 6 } };

		System.out.println(num[0][1]); // 2 찍기
		System.out.println(num[1][2]); // 6 찍기

		System.out.println("배열의 개수 : " + num.length);
		System.out.println();
		System.out.println("배열 0행의 개수 : " + num[0].length);
		System.out.println("배열 1행의 개수 : " + num[1].length);
		System.out.println();

		// 2줄 프린트
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
