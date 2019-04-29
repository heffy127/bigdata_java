package makeParts;
//스마트폰 객체 => 클래스
//정적특성 	- 모양, 크기, 회사	=> member변수 
//동적특성 	- 전화하다, 문자하다, 알람을 설정하다		=> 메소드
public class Phone {
	String shape;
	int size;
	String company;
	
	public String call() {
		return "친구";
	}
	
	public void text() {
		System.out.println("문자하다.");
	}
	
	public int alarm() {
		return 7;
	}

	@Override
	public String toString() {
		return "Phone [shape=" + shape + ", size=" + size + ", company=" + company + "]";
	}
	
}
