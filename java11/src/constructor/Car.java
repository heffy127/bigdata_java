package constructor;

public class Car {
	// 정적속성
	String color;
	boolean convertible;

	
	
	public Car() {
		super();
		System.out.println("객체 생성");
	}

	public Car(String color) {
		super();
		this.color = color;
		this.convertible = false;
	}

	public Car(String color, boolean convertible) {
		super();
		this.color = color;
		this.convertible = convertible;
	}

	// 동적속성
	public void change() {
		System.out.println("기어 변속을 하다");
	}

	public int speedUp(int nowSpeed) {
		return nowSpeed + 30;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", convertible=" + convertible + "]";
	}
}
