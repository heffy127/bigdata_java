package example;

public class High extends Student{
	int score;
	
	public void myscore() {
		System.out.println("내 모의고사 점수는 " + score);
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("고등학생이 공부하다.");
	}
	
	
}
