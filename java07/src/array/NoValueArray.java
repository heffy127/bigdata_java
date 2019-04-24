package array;

public class NoValueArray {
	public static void main(String[] args) {
		int[] num = new int[3];
		// 배열에 값을 넣어두지 않으면,
		// 자동으로 해당하는 타입의 값으로 초기화
		// int -> 0
		
		for(int i : num)
			System.out.println(i);
		
	}
}
