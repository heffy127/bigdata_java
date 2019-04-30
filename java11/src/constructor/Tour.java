package constructor;

public class Tour {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "검정";
		car1.convertible = true;
		
		System.out.println(car1);
		car1.change();
		int exSpeed = car1.speedUp(100);
		System.out.println(exSpeed);
		System.out.println();
		
		Car car2 = new Car("빨강", true);
		System.out.println(car2);
		
		Car car3 = new Car("하양");
		System.out.println(car3);
	}
	
}
