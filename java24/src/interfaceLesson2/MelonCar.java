package interfaceLesson2;

public class MelonCar implements Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("메론 카 출발");
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("메론 카 속도 증가");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("메론 카 속도 감소");
	}

}
