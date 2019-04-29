package makeParts;

public class MyRoom {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.company = "Apple";
		p1.shape = "네모";
		p1.size = 11;
		
		System.out.println(p1.company + "\t" + p1.shape + "\t" + p1.size);
		p1.call();
		p1.text();
		p1.alarm();
		
		Phone p2 = new Phone();
		p2.company = "Samsung";
		p2.shape = "둥근 네모";
		p2.size = 13;
		
		
		System.out.println("======================");
				//	  stack            heap
		Television tv1 = new Television();
		tv1.color = "검정색";
		tv1.power = true;
		tv1.size = 50;
		
		// System.out.println(tv1.color + "\t" +tv1.power + "\t" + tv1.size);
		System.out.println(tv1);	// toString() 사용
		tv1.changeCh();
		tv1.connect();
		tv1.sound();
		System.out.println();
		
		// Class를 복사해서 만든  tv2를 객체(대상, object)라고 부른다.
		// new의 역할 : 객체 생성
		Television tv2 = new Television();
		tv2.color = "하얀색";
		tv2.power = false;
		tv2.size = 43;
		
		// System.out.println(tv2.color + "\t" +tv2.power + "\t" + tv2.size );
		System.out.println(tv2);
		tv2.connect();
	}
}
