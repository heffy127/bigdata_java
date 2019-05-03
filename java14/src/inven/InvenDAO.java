package inven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InvenDAO {
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	int res = 0;

	public InvenDAO() {
		super();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url = "jdbc:mysql://localhost:3306/cafe";
			user = "root";
			password = "12341234";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void plusInven(String name, int num) {
		try {
			String sql = "update inven set ? = ? + ?";

			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, name);
			ps.setInt(3, num);
			
			res = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (res != 0)
					ps.close();
				if (res != 0)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public void minusinven(int productNum) {
//		try {
//			String sql = "update inven set w";
//
//			ps = con.prepareStatement(sql);
//			ps.setString(1, name);
//			ps.setString(2, name);
//			ps.setInt(3, num);
//			
//			res = ps.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (res != 0)
//					ps.close();
//				if (res != 0)
//					con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
}
