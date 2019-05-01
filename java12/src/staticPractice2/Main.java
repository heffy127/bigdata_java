package staticPractice2;

public class Main {
	public static void main(String[] args) {
		Worker wk1 = new Worker("임아무개","남", 24);
		Worker wk2 = new Worker("김아무개","여", 23);
		Worker wk3 = new Worker("박아무개","남", 25);
		
		System.out.println("전체 직원수는 : " + Worker.cnt);
		System.out.println("첫번 째 직원들의 이름은: " + wk1.getName());
		System.out.println("직원들의 평균 나이는 " + wk3.average());
	}
}
