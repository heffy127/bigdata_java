package makeParts;

public class Calculator {
	
	//add(200, 100)
	public int add(int x, int y) {
		return x+y;
	}
	
	//add(200, 100.12)
	public void add(int x, double y) {
		System.out.println(x+y);
	}
	
	// 자바는 메소드 이름을 동일하게 할 수 있다.
	// 하나의 이름으로 다양한 형태를 구현하는 기능. => 다형성(overloading)
	
	public void add(String x, int y) {
		System.out.println(x + y);
	}
}
