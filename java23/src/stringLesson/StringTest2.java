package stringLesson;

public class StringTest2 {
	public static void main(String[] args) {
		String s1 = "I am a java programmer";
		String s2 = "I am a C programmer";
		String s3 = "1245987";
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));	// 내용이 같은가 다른가
		System.out.println(s1.length()); // 길이
		System.out.println(s3.charAt(3)); // char로 출력하고 싶은 부분
		
		StringBuffer buf = new StringBuffer("hello");
		System.out.println(buf.charAt(2));
		StringBuffer ssn = new StringBuffer("941227-1234567");
		System.out.println(ssn.charAt(7));
		
		System.out.println(s1.substring(5)); // 5부터 끝까지 추출
		System.out.println(s1.substring(7, 11)); // 5부터 11이전까지 추출
		
		String[] sarray= s1.split(" "); // ( ) 안의 문자 기준으로 문자열을 나눔
										//  . 은  split("[.]") 이렇게 대괄호 안에 넣어야지만 구분이 됨
		for(String s : sarray)
			System.out.println(s);
		
		String s7 = "http://www.naver.com/member/index.jsp";
						//(s7.IndexOf("/") 찾는 문자열의 첫번째 등장번호
		System.out.println(s7.lastIndexOf("/")); // 찾는 문자열의 마지막 등장번호 (jsp에서 자주 사용)
		System.out.println(s7.substring(28));	// 반환받은 인덱스값으로 뒤에 문자열 출력
		
		System.out.println(s7.toUpperCase()); // 대문자 변환
		System.out.println(s2.toLowerCase()); // 소문자 변환
		System.out.println(s2.replaceAll("C", "Python")); // 문자열 변환
		
		char[] carray = s2.toCharArray();	// 문자열을 char배열에 나눠 담기
		for(char c : carray)
			System.out.println(c);
			
		String s8 = "     korea   ";
		System.out.println(s8.trim());	// 앞뒤 공백제서
		
		System.out.println(s8.concat(s7));	// 문자열 이어붙이기
		System.out.println(s7.contains("naver"));	// 인자로 전달된 문자열을 포함하는지 여부를 boolean으로 반환 (유용)
		String s9 = "south korea";
		System.out.println(s9.startsWith("south"));	// 인자로 전달된 문자열로 '시작'하는지 여부를 boolean으로 반환
		System.out.println(s9.endsWith("japan"));	// 인자로 전달된 문자열로 '끝'나는지 여부를 boolean으로 반환
		
		
	
	}
}
