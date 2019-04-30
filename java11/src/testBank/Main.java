package testBank;

public class Main {
	public static void main(String[] args) {
		Bank b1 = new Bank("청약저축","김아무개",500);
		Bank b2 = new Bank("내비상금","김아무개딸",30);
		Bank b3 = new Bank("자유적금","박아무개",100);
		int familyMoney = b1.money + b2.money + b3.money;
		
		System.out.println(b2.product + " 통장에는 " + b2.money + "만원이 들어있어요.");
		System.out.println(b3.name + "의 통장에는 " + b3.money + "만원이 들어있어요.");
		System.out.println();
		System.out.println("우리 집 전체 예금액은 " + familyMoney + "만원 이예요.!");
	}
	
}
