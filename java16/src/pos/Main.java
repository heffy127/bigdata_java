package pos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main {
	private static JTable table;
	static ArrayList<MenuDTO> list = new ArrayList<>();
	static int num = 0;
	
	public static void main(String[] args) {
		Main main = new Main();
		
		JFrame f1 = new JFrame("카페 포스 시스템");
		f1.setSize(1080, 800);
		f1.getContentPane().setLayout(null);
		
		String[] col = {"번호","메뉴","가격","수량","쿠폰여부"};
		DefaultTableModel tmodel = new DefaultTableModel(col, 0);
		
		table = new JTable(tmodel);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 98, 603, 358);
		f1.getContentPane().add(scrollPane);
		scrollPane.setViewportView(table);
		
		
		JButton b1 = new JButton("\uACB0\uC81C");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}//결제
		});
		b1.setFont(new Font("굴림", Font.BOLD, 26));
		b1.setBounds(27, 25, 129, 50);
		f1.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uBA64\uBC84\uC27D");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}//멤버쉽
		});
		b2.setFont(new Font("굴림", Font.BOLD, 26));
		b2.setBounds(192, 25, 129, 50);
		f1.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uC7AC\uACE0");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}//재고
		});
		b3.setFont(new Font("굴림", Font.BOLD, 26));
		b3.setBounds(355, 25, 129, 50);
		f1.getContentPane().add(b3);
		
		JButton b4 = new JButton("에스프레소");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b4.setFont(new Font("굴림", Font.BOLD, 15));
		b4.setBounds(642, 98, 117, 50);
		f1.getContentPane().add(b4);
		
		
		JButton button = new JButton("아메리카노");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] obj = new Object[5];
				
				
		
				++num;
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 15));
		button.setBounds(771, 98, 117, 50);
		f1.getContentPane().add(button);
		
		JButton button_1 = new JButton("아메리카노");
		button_1.setFont(new Font("굴림", Font.BOLD, 15));
		button_1.setBounds(900, 98, 117, 50);
		f1.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("아메리카노");
		button_2.setFont(new Font("굴림", Font.BOLD, 15));
		button_2.setBounds(642, 158, 117, 50);
		f1.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("아메리카노");
		button_3.setFont(new Font("굴림", Font.BOLD, 15));
		button_3.setBounds(771, 158, 117, 50);
		f1.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("아메리카노");
		button_4.setFont(new Font("굴림", Font.BOLD, 26));
		button_4.setBounds(900, 158, 117, 50);
		f1.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("아메리카노");
		button_5.setFont(new Font("굴림", Font.BOLD, 26));
		button_5.setBounds(642, 218, 117, 50);
		f1.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("아메리카노");
		button_6.setFont(new Font("굴림", Font.BOLD, 26));
		button_6.setBounds(771, 218, 117, 50);
		f1.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("아메리카노");
		button_7.setFont(new Font("굴림", Font.BOLD, 26));
		button_7.setBounds(900, 218, 117, 50);
		f1.getContentPane().add(button_7);
		
		
		
		
		f1.setVisible(true);
	}
}