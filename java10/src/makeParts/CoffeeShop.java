package makeParts;

public class CoffeeShop {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.add(5000, 4000);
		System.out.println(sum - 1000 + "원만 내세요.");
	}
}
