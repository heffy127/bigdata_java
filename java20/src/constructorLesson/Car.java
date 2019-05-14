package constructorLesson;

public class Car {
	String color;
	int speed;
	
	
	
	public Car() {
		// 기본 생성자 어지간해선 같이 만들것
		System.out.println("차 객체 생성...");
	}



	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
}
