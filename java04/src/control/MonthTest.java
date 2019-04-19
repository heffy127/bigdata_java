package control;

import java.util.Date;

public class MonthTest {
	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1; // getMonth()는 실제 달보다 1달 적게 받아옴
		String monthMax = "";
		switch(month) {
		case 2 :
			monthMax= "28일까지 있는 달입니다.";
			break;
		case 4 : case 6 : case 9 : case 11 : 
			monthMax= "30일까지 있는 달입니다.";
			break;
		default :
			monthMax= "31일까지 있는 달입니다.";
		}
		
		System.out.println("지금은 " + month + "월, " + monthMax);
	}
}
