package test;

public class UseBank {
	public static void main(String[] args) {
		
	BadBank bad = new BadBank();
	NormalBank nor = new NormalBank();
	GoodBank good = new GoodBank();
	
	System.out.println("BadBank의 이자율 : " + bad.getInteresRate());
	System.out.println("NormalBank의 이자율 : " + nor.getInteresRate());
	System.out.println("GoodBank의 이자율 : " + good.getInteresRate());
	}
	
}
