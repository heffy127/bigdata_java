package control;
/*
 * 오늘 아침에 대한 정보 출력 (변수에 저장해서 출력)
 * ------------------
 * 오늘 아침을 먹고 왔나요? true 
 * 	오늘 타고 온 버스의 번호나 지하철 노선은 : 2호선	
 * 오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는: 9 
 * 오늘부터 프로젝트 함께할 우리 조원의 이름은 : 홍길동
 */
public class Day3 {
	public static void main(String[] args) {
		boolean breakfast = true;
		int train = 1;
		double yesterD = 10.5; 
		double compareD = 5.5;
		double todayD = 9.0;
		String member = "윤현우";
		System.out.println("---------------");
		System.out.println("오늘 아침을 먹고 왔나요: " + breakfast);
		System.out.println("오늘 타고 온 버스의 번호나 지하철 노선은 : " + train + "호선");
		System.out.println("오늘은 어제(" + yesterD + ")보다 " + compareD + "도 낮아요. 오늘의 온도는 : " + todayD);
		System.out.println("오늘부터 프로젝트 함께할 우리 조원의 이름은 : " + member);
	}
}
