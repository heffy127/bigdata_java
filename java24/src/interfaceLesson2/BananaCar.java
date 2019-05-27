package interfaceLesson2;

public class BananaCar implements Car{
	public void start() {
		System.out.println("차가 달리기 시작");
	}
	
	public void speedUp() {
		System.out.println("속도를 Up");
	}
	
	public void speedDown() {
		System.out.println("속도를 Down");
	}
}
