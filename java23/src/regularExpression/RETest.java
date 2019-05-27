package regularExpression;

public class RETest {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};
		
		String s2 = "Hi, Hello!! call";
		String[] s3 = s2.split("H[a-z]");	// H와 그 뒤에 영문자가 오는 문자열이 구분자가 됨
//								H[a-zA-Z] 대소문자 구분 X
		for(String s : s3)
			System.out.println(s);
		
		String[] s4 = s2.split("H[a-z][a-z]");	// H와 그 뒤에 영문자 2개가 오는 문자열이 구분자가 됨
		for(String s : s4)
			System.out.println(s);	// 'Hi,'는 안되고 'Hel'lo는 해당
		
		String s5 = "Hi7, Hello! call";
		String[] s6 = s5.split("H[a-z][0-9]");
		for(String s : s6)
			System.out.println(s);	// 'Hi7' 해당
		
		
		
	}
}
