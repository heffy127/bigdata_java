package control;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// 아무값이나 만들어주는 class : Random
		Random rand = new Random();
		System.out.println(rand.nextInt(100));
		
	}
}
