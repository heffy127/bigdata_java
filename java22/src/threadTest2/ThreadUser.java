package threadTest2;

public class ThreadUser {
	public static void main(String[] args) {
		ThreadPrint1 t1 = new ThreadPrint1();
		ThreadPrint2 t2 = new ThreadPrint2();
		ThreadPrint3 t3 = new ThreadPrint3();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
