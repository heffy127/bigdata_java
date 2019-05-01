package umlPractice;
// 12일차 uml 구현
public class Clock {
	private int price;
	private String name;
	private int nowTime;
	private String compnay;
	public Clock(int price, String name, int nowTime, String compnay) {
		super();
		this.price = price;
		this.name = name;
		this.nowTime = nowTime;
		this.compnay = compnay;
	}
	public Clock(int price, int nowTime, String compnay) {
		super();
		this.price = price;
		this.nowTime = nowTime;
		this.compnay = compnay;
	}
	public Clock(int price, String compnay) {
		super();
		this.price = price;
		this.compnay = compnay;
	}
	public int getPrice() {
		return price;
	}
	public String getCompnay() {
		return compnay;
	}
}
