package staticPractice;

public class Main {
	public static void main(String[] args) {
		Day d1 = new Day("자바공부", 10, "강남");
		Day d2 = new Day("여행", 15, "강원도");
		Day d3 = new Day("운동", 11, "피트니스");
		Day[] day = new Day[] {d1,d2,d3};  
		
		Day.workTime = d1.hour + d2.hour + d3.hour;
		System.out.println("전체 하는 일의 시간은 : " + Day.workTime);
		System.out.println("평균 하는 일의 시간은 : " + d3.avg());
		for(Day d : day)
			System.out.println(d);
		System.out.println("며칠 간 했는지? : " + Day.cnt + "일");
		
	}
}
