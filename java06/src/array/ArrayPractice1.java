package array;

public class ArrayPractice1 {
	public static void main(String[] args) {
		String[] names = {"김길동", "박길동", "홍길동"};
		System.out.println(names);
		System.out.println(names[0]); 
		// 위치값을 가직 배열에 있는 값들을 구분
		// 위치값 = index(인덱스), 0부터 시작
		System.out.println(names[2]);
		System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
}
