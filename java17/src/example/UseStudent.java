package example;

public class UseStudent {
	public static void main(String[] args) {
		Elementry e = new Elementry();
		e.name = "음바페";
		e.subject = "슬기로운 생활";
		e.myname();
		e.mysubject();
		e.study();
		
		Middle m = new Middle();
		m.name = "살라";
		m.teacher = "클롭";
		m.myname();
		m.myteacher();
		m.study();
		
		High h = new High();
		h.name = "무암바";
		h.score = 75;
		h.myname();
		h.myscore();
		h.study();
	}
}
