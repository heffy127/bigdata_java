package makeManual;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarManual {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();	 // 오늘 날짜 받아오기
		//		 today.get(찾고자 하는 값);
		System.out.println(today.get(Calendar.YEAR));	// 연도 출력
		System.out.println(today.get(Calendar.MONTH));	// 월 출력
		System.out.println(today.get(Calendar.DATE));	// 일 출력
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); 	// 요일 출력 (1부터 일요일)
		System.out.println();
		System.out.println(today.get(Calendar.AM_PM)); // 오전일때 0
		System.out.println(today.get(Calendar.HOUR));	// 12시간 기준
		System.out.println(today.get(Calendar.HOUR_OF_DAY));	// 24시간 기준
		System.out.println(today.get(Calendar.MINUTE));	// 분 출력
		System.out.println(today.get(Calendar.SECOND));	// 초 출력
		System.out.println();
		System.out.println(today.get(Calendar.DAY_OF_YEAR));	// 오늘은 올해의 몇번째 날
		System.out.println(today.getActualMaximum(Calendar.DATE));	// 이번달의 마지막 일 
		System.out.println();										// 5월은 31일 까지라 31출력
		System.out.println(today.getTime()); // 날짜 요일 시간 협정세계시 모두 출력 (기본 포멧)
		
		today.set(2019, 3, 7);	// 날짜 직접 지정
		
		// Calendar 출력 포멧 직접 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		
												// y=년도 M=월 d=일 E=요일    H=시 m=분 s=초
		System.out.println(sdf.format(today.getTime())); // 내가 정한 포멧으로 Calendar 출력
		
		
	}
}
