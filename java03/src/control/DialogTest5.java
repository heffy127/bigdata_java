package control;
//반지름이 12인 원의 면적은...
//가로가 11, 세로가 22인 사각형의 면적은
//가로 세로가 같은가요? false
//반지름이 10보다 큰가요? true
public class DialogTest5 {
	public static void main(String[] args) {
		final double PI = 3.14;
		int radius = 12;
		double circle = PI * radius * radius;
		System.out.println("반지름이 12인 원의 면적은 " + circle + "입니다.");
		
		int width = 11;
		int height = 22;
		int square = width * height;
		System.out.println("가로가 11, 세로가 22인 사각형의 면적은 " + square + "입니다.");
		
		boolean question = (width == height); 
		System.out.println("가로 세로가 같은가요 ? " + question);
		
		boolean question2 = (radius > 10);
		System.out.print("반지름이 10보다 큰가요? " + question2);
	}
}
