package interfacePractice;

public class KiwiJuice implements JuiceInterface{

	@Override
	public void sweet() {
		// TODO Auto-generated method stub
		System.out.println("와!엄청달다!");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("3000원");
	}

	@Override
	public void ingredients() {
		// TODO Auto-generated method stub
		System.out.println("Kiwi");
	}
	
}
