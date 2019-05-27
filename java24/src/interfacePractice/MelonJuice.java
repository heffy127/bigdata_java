package interfacePractice;

public class MelonJuice implements JuiceInterface {

	@Override
	public void sweet() {
		// TODO Auto-generated method stub
		System.out.println("와!달다!");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("2500원");
	}

	@Override
	public void ingredients() {
		// TODO Auto-generated method stub
		System.out.println("멜론");
	}

}
