package control;

import javax.swing.JOptionPane;

//오늘의 치킨 가격은 얼마인가요? 입력받으세요
//9000이 넘으면 내일 다시 전화할게요
//아니면 주문할게요
public class DialogTest3 {
	public static void main(String[] args) {
		String price = JOptionPane.showInputDialog("오늘의 치킨가격은 얼마인가요?");
		int p = Integer.parseInt(price);
		if(p > 9000)
			System.out.println("내일 다시 전화할게요..");
		else
			System.out.println("주문하겠습니다. ^^");
	}
}
