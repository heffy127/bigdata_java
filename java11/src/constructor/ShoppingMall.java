package constructor;

import javax.swing.JOptionPane;

public class ShoppingMall {
	public static void main(String[] args) {
		Member[] m = new Member[500];
		int i;
		
		for(i=0; i < m.length; i++) {
			String input = JOptionPane.showInputDialog("이름, 나이, 연락처, 주소\n나가기 ('종료'입력)");
			if(input.equals("종료"))
				break;
			String[] temp = input.split(", ");
			String name = temp[0];
			int age = Integer.parseInt(temp[1]);
			String tel = temp[2];
			String address = temp[3];

			m[i] = new Member(name, age, tel, address);
		}

		System.out.println("쇼핑몰 회원가입 명단입니다.");
		System.out.println("======================");
		System.out.println("이름\t\t나이\t\t연락처\t\t주소");
		System.out.println("---------------------------------------");
		for(int j = 0; j < i; j++) {
			System.out.println(m[j]);
		}
	}
}
