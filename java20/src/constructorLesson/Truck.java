package constructorLesson;

public class Truck extends Car {
	int weight;
	int length;

	public Truck() {
		System.out.println("트럭 객체 생성..");
	}
	
	public Truck(int weight, int length) {
//		super(); 자식 클래스 생성시 부모의 기본 생성자를 무조건 호출 (부모가 있어야 자식이 존재)
		this.weight = weight;
		this.length = length;
	}

	public Truck(String color, int speed, int weight, int length) {
		super(color, speed);	// 부모에게 있는 변수가 부모한테 알아서하라고 넘겨줌
		this.weight = weight;
		this.length = length;
	}
	
	


}
