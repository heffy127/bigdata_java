package lesson;

public class StringPractice {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "Adef";
		System.out.println(s1.charAt(0));
		System.out.println(s2.substring(0, 2));
		String s3 = s1.concat(s2);
		String s4 = s1 + s2;
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s2.compareToIgnoreCase(s1));
	}
}
