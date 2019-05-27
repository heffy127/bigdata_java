package interfaceLesson;

public class Shop implements Pay, Circle {

	@Override
	public void radius() {
		System.out.println("문 반지름");

	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("가게 사이즈");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("결제");
	}

}
