package data;

public class DataTest { // Camel 표기법

	public static void main(String[] args) {
		//		  comment, 주석, 설명 (ctrl + /)
		System.out.println("나의 데이터 프린트"); //  ctrl + space 자동완성
		
		int spaceY = 300;	// -21 ~ 21억 [4byte 정수형]
		// byte(1byte, 8bit : -128 ~ 127)
		// short(2)
		// int(4)
		// long(8)
		
		int startX = 0;
		int startY = 0;
		int result = startX + startY;
		String result2 = "그래픽의 시작점 y축은 " + startY;
		
		System.out.println("그래픽의 시작점 x축은 " + startX); // + <- 연결 연산자
		System.out.println(result2);
		
		System.out.println();
		
		float x = 5.5f;	// 기본적으로 실수는 double로 인식
		double y = 5.5;	// [8byte 실수형] 
		
		char gender = '남';	// [2byte 문자형]
		boolean breakTime = true;	// false [1byte 논리형]
		
	}

}
