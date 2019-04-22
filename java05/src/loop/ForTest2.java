package loop;

public class ForTest2 {
	int test; // 전역(global)변수

	public static void main(String[] aaa) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("★\t");
			}
			System.out.println();
		}
	}
}
