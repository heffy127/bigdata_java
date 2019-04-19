package control;

import java.util.Date;

public class SeasonTest {
	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1; // getMonth()는 실제 달보다 1달 적게 받아옴
		String season = "";
		switch(month) {
		case 3 : case 4 : case 5 :
			season = "봄";
			break;
		case 6 : case 7 : case 8 :
			season = "여름";
			break;
		case 9 : case 10 : case 11 :
			season = "가을";
			break;
		default:
			season = "겨울";
		}
		
		System.out.println("지금은 " + month + "월, " + season + "입니다.");
	}
}
