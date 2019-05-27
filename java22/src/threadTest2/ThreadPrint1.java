package threadTest2;

public class ThreadPrint1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 9; i++) {			
			System.out.print("★");
		}
	}
}
