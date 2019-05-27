package interfacePractice;

public class BuyJuice {
	public static void main(String[] args) {
		MelonJuice mj = new MelonJuice();
		mj.sweet();
		mj.price();
		mj.ingredients();
		
		JuiceInterface kj = new KiwiJuice();
		kj.sweet();
		mj.price();
		kj.ingredients();
	}
}
