//package dbComponents;
//
//import java.util.Scanner;
//
//public class DBInsert {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("---회원가입 정보 입력---");
//		System.out.print("아이디 : ");
//		String id = sc.next();
//		System.out.print("패스워드 : ");
//		String pw = sc.next();
//		System.out.print("이름 : ");
//		String name = sc.next();
//		System.out.print("연락처 : ");
//		String tel = sc.next();
//		
//		CRUDmodel ic = new CRUDmodel();
//		try {
//			ic.insert(id, pw, name, tel);
//		} catch (Exception e) {
//			System.out.println("에러 발생");
//			e.printStackTrace();
//		}
//	}
//}
