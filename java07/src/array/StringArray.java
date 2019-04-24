package array;

public class StringArray {
	public static void main(String[] args) {
		int[] ages = {50, 100, 10};
		String[] names = {"홍길동", "박길동", "김길동"};
		names[2] = "김동길";
		names[names.length-1] = "김동무";
		
		for(String n : names)	// Enhanced-for
			System.out.print(n + "\t");
		
		System.out.println();
		
		for(int n : ages)
			System.out.print(n + "\t");
	}
}
