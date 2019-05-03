
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class adf extends JFrame implements ActionListener{
	
	JTextField textSabun, textName;
	JButton btnLogin;
	JPanel panel;
	
	DefaultTableModel model;
	JTable table;
	JLabel lblSabun, lblName, lblCount;
	
	String [][] datas=new String[0][6];
	String [] title= {"사번", "이름", "성별", "연봉", "세금", "실수령액"};
	
	Connection conn;
	PreparedStatement pstmt1, pstmt2;
	ResultSet rs1, rs2;
	
	public adf() {
		
		super("직원 연봉정보");
		
		layInit();
		accDb();
		
		setBounds(200, 200, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void layInit() {
		panel=new JPanel();
		lblSabun=new JLabel("사번: ");
		textSabun=new JTextField("", 5);
		lblName=new JLabel("이름: ");
		textName=new JTextField("", 5);
		panel.add(lblSabun);
		panel.add(textSabun);
		panel.add(lblName);
		panel.add(textName);
		btnLogin=new JButton("로그인");
		panel.add(btnLogin);
		add("North", panel);
		
		textSabun.addActionListener(this);
		textName.addActionListener(this);
		btnLogin.addActionListener(this);
		
		model=new DefaultTableModel(datas, title);
		table=new JTable(model);
		
		JScrollPane scp=new JScrollPane(table);
		add("Center", scp);
		
		lblCount=new JLabel("연봉평균"+"\t\t\t"+"남: "+"0"+"여: "+"0");
		add("South", lblCount);
	}
	
	private void accDb() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			pstmt1=conn.prepareStatement("select jikwon_no, jikwon_name from jikwon "
					+ " where jikwon_no=? and jikwon_name=?"); 
			pstmt2=conn.prepareStatement("select jikwon_no, jikwon_name, jikwon_gen, jikwon_pay, "
					+ " case when jikwon_pay>=5000 then (jikwon_pay*0.05) "
					+ " when jikwon_pay>=4000 then (jikwon_pay*0.04) "
					+ " else (jikwon_pay*0.03) end as 세금, "
					+ " case when jikwon_pay>=5000 then jikwon_pay-(jikwon_pay*0.05) "
					+ " when jikwon_pay>=4000 then jikwon_pay-(jikwon_pay*0.04) "
					+ " else jikwon_pay-(jikwon_pay*0.03) end as 실수령액 "
					+ " from jikwon where jikwon_pay is not null");
		} catch (Exception e) {
			System.out.println("accDb err: "+e);
		} 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("입력값은: "+textSabun.getText()+textName.getText());
		try {
			pstmt1.setString(1, textSabun.getText());
			pstmt1.setString(2, textName.getText());
			rs1=pstmt1.executeQuery();
			System.out.println("rs1 실행");
			if(rs1.isBeforeFirst()) {
				outputInfo();				
			} else {
				JOptionPane.showMessageDialog(null,"정보를 제대로 입력하세요.");
			}
		} catch (Exception e2) {
			System.out.println("actionPerformed err: "+e2);
		}
	}
	
	private void outputInfo() {
		System.out.println("outputInfo 메소드 실행");
		try {
			rs2=pstmt2.executeQuery();
			System.out.println("rs2 실행");
			while(rs2.next()) {
				String no=rs2.getString("jikwon_no");
				String name=rs2.getString("jikwon_name");
				String gen=rs2.getString("jikwon_gen");
				String pay=rs2.getString("jikwon_pay");
				String tax=rs2.getString("세금");
				String realpay=rs2.getString("실수령액");
	
				String []imsi= {no, name, gen, pay, tax, realpay};
				model.addRow(imsi);
			}
		} catch (Exception e) {
			System.out.println("outputInfo err: "+e);
		} finally {
			try {
				if(rs2!=null) rs2.close();
				if(rs1!=null) rs1.close();
				if(pstmt2!=null) pstmt2.close();
				if(pstmt1!=null) pstmt1.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {}
		}
	}

	public static void main(String[] args) {
		new adf();
	}
}
