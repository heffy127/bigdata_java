package constructorTest;

public class SuperMan extends Man {
	String superPower;
	boolean canFly;
	
	public SuperMan() {
		// TODO Auto-generated constructor stub
	}

	public SuperMan(String name, int age, String superPower, boolean canFly) {
		super(name, age);
		this.superPower = superPower;
		this.canFly = canFly;
	}

	@Override
	public String toString() {
		return "SuperMan [superPower=" + superPower + ", canFly=" + canFly + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
