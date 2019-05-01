package staticPractice;

public class Day {
	static int workTime = 0; // 전체 일의 시간
	static int cnt = 0;	// 날짜 카운트
	
	String work;
	int hour;
	String place;
	public Day(String work, int hour, String place) {
		super();
		this.work = work;
		this.hour = hour;
		this.place = place;
		cnt++;
		workTime += hour;
	}
	
	public int avg() {
		return workTime / cnt;
	}
	
	@Override
	public String toString() {
		return work+"\t"+hour+"\t"+place;
	}
}
