package threadTest2;

public class ThreadPrint3 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.print("♧");			
		}
	}
}
