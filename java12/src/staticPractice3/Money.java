package staticPractice3;

public class Money {
	static int fatherMoney = 10000;
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Money() {
	
	}
	
	public Money(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		fatherMoney -= 1000;
	}

	public void play() {
		System.out.println(name + "(이)가 놀아요.");
	}
	
	public void tv() {
		System.out.println(name + "(이)가 tv봐요.");
	}
}
