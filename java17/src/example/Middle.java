package example;

public class Middle extends Student{
	String teacher;
	
	public void myteacher() {
		System.out.println("선생님 성함은 " + teacher);
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("중학생이 공부하다.");
	}
	
	
}
