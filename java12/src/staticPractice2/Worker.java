package staticPractice2;

public class Worker {
	static int ageSum = 0;
	static int cnt = 0;
	
	private String name;
	private String gender;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Worker(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		ageSum += age;
		++cnt;
	}
	
	public void work() { 
		System.out.println("일하다.");
	}
	
	public void friendly() {
		System.out.println("친화력이 있다.");
	}
	
	public int average() {
		return ageSum/cnt;
	}
}
