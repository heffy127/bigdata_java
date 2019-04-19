package control;

import java.util.Date;

public class DayTest {
	public static void main(String[] args) {
		Date myDate = new Date();
		int day = myDate.getDay();
		int month = myDate.getMonth() + 1;
		int d = myDate.getDate();
		String doit = "";

		switch (day) {
		case 0:
			doit="일요일은 집에서 쉬는 날";
			break;
		case 1:
			doit="월요일은 학원가는 날";
			break;
		case 2:
			doit="화요일은 운동하는 날";
			break;
		case 3:
			doit="수요일은 학원가는 날";
			break;
		case 4:
			doit="목요일은 게임하는 날";
			break;
		case 5:
			doit="금요일은 친구만나는 날";
			break;
		default:
			doit="토요일은 낮잠자는 날";
		}
		
		System.out.println("오늘은 " + month + "월 " + d + "일 " + doit);
	}
}
