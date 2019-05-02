package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;


public class DBPhone {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "Jdbc:mysql://localhost:3306/myphone";
		String user = "root";
		String password = "12341234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "insert into product values(?,?,?,?)";
		String id = JOptionPane.showInputDialog("id입력");
		String title = JOptionPane.showInputDialog("title입력");
		int price = Integer.parseInt(JOptionPane.showInputDialog("price입력"));
		String company = JOptionPane.showInputDialog("company입력");
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setInt(3, price);
		ps.setString(4, company);
		ps.executeUpdate();
	}
}
