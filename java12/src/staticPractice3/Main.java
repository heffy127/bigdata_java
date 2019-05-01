package staticPractice3;

public class Main {
	public static void main(String[] args) {
		Money money0 = new Money();
		Money money1 = new Money("김아무개1", 15);
		Money money2 = new Money("김아무개2", 5);
		System.out.println(money1.getName() + ", " + money2.getName());
		money1.play();
		money1.tv();
		System.out.println(Money.fatherMoney);
	}
	
}
