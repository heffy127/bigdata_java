package cal;
//200과 100을 더해서,
//300이 넘으면, 300에서 100을 빼서 프린트
//300이 넘지 않으면, 300에서 0.1을 곱해서 프린트
public class CalTest {
	public static void main(String[] args) {
		int result = 200 + 100;
		
		if(result >= 300) {
			System.out.println(result - 100);
		}else {
			System.out.println((int)(result * 0.1));
		}
	}
}
