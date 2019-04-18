package control;

import javax.swing.JOptionPane;

// 12p 문제
public class DialogTest6 {
	public static void main(String[] args) {
		double speed = Integer.parseInt(JOptionPane.showInputDialog("속도 점수 입력 (100점 만점) : ")) * 0.5;
		double safety = Integer.parseInt(JOptionPane.showInputDialog("안정성 점수 입력 (100점 만점) : ")) * 0.3;
		double efficiency = Integer.parseInt(JOptionPane.showInputDialog("연비 점수 입력 (100점 만점) : ")) * 0.2;
		double total = speed + safety + efficiency;
		System.out.println("자동차 평점 : " + total);
		if(total >= 80)
			System.out.println("80점 이상!! Best!!");
		else if(total >= 70)
			System.out.println("70점 이상 So So..");
		else
			System.out.println("70점 미만 Not Good...");
	}
}
