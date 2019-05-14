package typeChange;

public class TypeChangeTest {
	public static void main(String[] args) {
		// 형변환 (Casting)
		// 기초형 형변환
		// 작 -> 큰 (자동 형변환) UpCasting
		byte a = 127;
		int b = a;
			
		// 큰 -> 작 (강제 형변환) DownCasting
		int c = 127;
		byte d = (byte)c;
		
		// 참조형 형변환 (클래스 형변환)
		// 상속관계에 있는 클래스들만 가능
	}
}
