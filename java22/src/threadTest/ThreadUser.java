package threadTest;

public class ThreadUser {
	public static void main(String[] args) {
		ThreadPlus t1 = new ThreadPlus();
		ThreadMinus t2 = new ThreadMinus();
		
		t1.start();
		t2.start();
	}
}
