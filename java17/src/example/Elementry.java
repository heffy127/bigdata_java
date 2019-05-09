package example;

public class Elementry extends Student{
	String subject;
	
	public void mysubject() {
		System.out.println("내가 배우는 과목은 " + subject);
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("초등학생이 공부하다.");
	}
	
	
}
