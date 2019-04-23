package array;
// 배열에 저장하고 출력
// 1. 친구 5명의 시력을 알고 있습니다.
// 2. 친구 5명의 성별을 알고 있습니다.
// 3. 친구 5명의 학점을 알고 있습니다.
// 4. 친구 5명의 이름을 알고 있습니다.
// 5. 친구 5명의 컴퓨터 점수를 알고 있습니다.

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] name = {"kim", "lee", "park", "choi", "jung"};
		char[] gender = {'M', 'F' ,'F', 'M', 'M'};
		char[] grade = {'B', 'C', 'B', 'B', 'A'};
		double[] va = {1.0, 1.5, 0.7, 0.5, 1.0};
		int[] comScore = {80, 50, 70, 70, 100};
		
		for (int i = 0; i < comScore.length; i++) {
			System.out.println("이름 : " + name[i]);
			System.out.println("성별 : " + gender[i]);
			System.out.println("시력 : " + va[i]);
			System.out.println("컴퓨터 점수 : " + comScore[i]);
			System.out.println("성적 : " + grade[i]);
			System.out.println();
		}
		
	}
}
