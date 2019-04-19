package control;

import java.util.Date;

public class YearTest {
	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900; // 1900을 더해줄 것  
		System.out.print("앞으로 2222년이 되려면 몇 년 남았나? ");
		System.out.println(2222 - year);
	}
}
