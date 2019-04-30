package constructor;

public class Member {
	String name;
	int age;
	String tel;
	String address;
	
	public Member(String name, int age, String tel, String address) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return name+"\t\t"+age+"\t\t"+tel+"\t\t"+address;
	}
	
	
	
	
}
