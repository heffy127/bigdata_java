package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class RSPWindow {
	public static void main(String[] args) {
		Random rand = new Random();
		int me = 0;
		int com = rand.nextInt(3);
		int result = me - com;
		String fin = "";
		JFrame frame = new JFrame();
		frame.setSize(406, 166);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton buttonResult = new JButton("누가 이기나 시합 시작");
		buttonResult.setFont(new Font("굴림", Font.PLAIN, 24));
		
		JButton buttonS = new JButton("가위");
		buttonS.setBackground(new Color(255, 51, 204));
		buttonS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int me = 0;
				int com = rand.nextInt(3);
				int result = me - com;
				String fin = "";
				if(result == -1 || result == 2) {
					fin = "* 컴퓨터 승리 *";
					buttonResult.setText(fin);
				} else if(result == -2 || result == 1) {
					fin = "** 나의 승리 **";
					buttonResult.setText(fin);
				} else {
					fin = "*** 무승부 ***";
					buttonResult.setText(fin);
				}
				System.out.println("가위(0) 바위(1) 보(2)");
				System.out.println("내가 낸것 : " + me);
				System.out.println("컴퓨터가 낸것 : " + com);
			}
		});
		buttonS.setFont(new Font("굴림", Font.PLAIN, 30));
		frame.getContentPane().add(buttonS);
		
		JButton buttonR = new JButton("바위");
		buttonR.setBackground(new Color(51, 153, 255));
		buttonR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int me = 1;
				int com = rand.nextInt(3);
				int result = me - com;
				String fin = "";
				if(result == -1 || result == 2) {
					fin = "* 컴퓨터 승리 *";
					buttonResult.setText(fin);
				} else if(result == -2 || result == 1) {
					fin = "** 나의 승리 **";
					buttonResult.setText(fin);
				} else {
					fin = "*** 무승부 ***";
					buttonResult.setText(fin);
				}
				System.out.println("가위(0) 바위(1) 보(2)");
				System.out.println("내가 낸것 : " + me);
				System.out.println("컴퓨터가 낸것 : " + com);
			}
		});
		buttonR.setFont(new Font("굴림", Font.PLAIN, 30));
		frame.getContentPane().add(buttonR);
		
		JButton buttonP = new JButton("보");
		buttonP.setBackground(new Color(255, 255, 51));
		buttonP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int me = 2;
				int com = rand.nextInt(3);
				int result = me - com;
				String fin = "";
				if(result == -1 || result == 2) {
					fin = "* 컴퓨터 승리 *";
					buttonResult.setText(fin);
				} else if(result == -2 || result == 1) {
					fin = "** 나의 승리 **";
					buttonResult.setText(fin);
				} else {
					fin = "*** 무승부 ***";
					buttonResult.setText(fin);
				}
				System.out.println("가위(0) 바위(1) 보(2)");
				System.out.println("내가 낸것 : " + me);
				System.out.println("컴퓨터가 낸것 : " + com);
			}
		});
		buttonP.setFont(new Font("굴림", Font.PLAIN, 30));
		frame.getContentPane().add(buttonP);
		
		
		frame.getContentPane().add(buttonResult);
		
		frame.setVisible(true);
	}
}
