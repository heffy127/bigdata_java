package window;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int minute = date.getMinutes();
		int seconds = date.getSeconds();
		System.out.println("현재시각 " + hour + "시 " + minute + "분 " + seconds + "초입니다.");
	}
}
