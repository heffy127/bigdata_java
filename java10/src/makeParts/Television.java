package makeParts;
//TV 객체
//정적특성	- 전원버튼, 사이즈, 색	=> 변수
//동적특성 	- 채널을 변경하다, 소리를 조절하다, 잭을 연결하다.	=> 메소드
public class Television {
	boolean power;
	int size; 
	String color;
	
	public void changeCh() {
		System.out.println("채널을 변경하다.");
	}
	
	public void sound() {
		System.out.println("소리를 조절하다.");
	}
	
	public void connect() {
		System.out.println("잭을 연결하다.");
	}
	
	@Override
	public String toString() {
		return power + "\t" + size + "\t" + color;
	}
}
