package threadLesson;

public class ThreadUser {
	public static void main(String[] args) {
		ForTest1 t1 = new ForTest1();
		ForTest2 t2 = new ForTest2();
		ForTest3 t3 = new ForTest3();
		
		// 스레드 실행
		t1.start();
		t2.start();
		t3.start();
	}
}
