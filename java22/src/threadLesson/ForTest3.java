package threadLesson;

public class ForTest3 extends Thread{

	@Override
	public void run() {	// 동시에 처리되게 하고 싶은 내용을 구현
		for (int i = 0; i < 100; i++) {
			System.out.println("스레드3-----");
		}
	}	
	
	
}
