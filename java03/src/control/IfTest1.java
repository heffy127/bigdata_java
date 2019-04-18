package control;

public class IfTest1 {
	public static void main(String[] args) {

		int food = 3;
		if (food == 1) {
			System.out.println("짜장면을 선택!!!");
		} else if (food == 2){
			System.out.println("짬뽕을 선택!!!");
		} else if (food == 3) {
			System.out.println("우동을 선택!!!");
		} else {
			System.out.println("다시 선택해주세요. 없는 메뉴입니다.");
		}

	} // main end. <- 표기해주면 편함
} // class end.
