package packageTest;

import packageSame.Member;

public class Manager extends Member {

	public Manager() {
		super();
		System.out.println(name); // public
		System.out.println(salary);	// protected (다른패키지라도 상속관계일 경우 가능)
		// System.out.println(age); default
		// System.out.println(ssn);	// private
	}
	
}
