package lesson;

public class SuperManUser {
	public static void main(String[] args) {
		SuperMan sman = new SuperMan();
		sman.height = 200;	// Person
		sman.weight = 100;	// Person
		sman.eye = 3;	// Man
		sman.fly = true;	// SuperMan
		sman.eat();
		sman.sleep();
		sman.army();
		sman.flySpeed();
		System.out.println(sman);
	}
}
