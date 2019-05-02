package dbComponents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUDmodel {
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	int res = 0;
	
	public CRUDmodel() {
		super();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "12341234";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(String id, String pw, String name, String tel) {
		try {
			String sql = "insert into member values(?,?,?,?)";

			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
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

	public void update(String id, String tel) {
		try {
			String sql = "update member set tel = ? where id = ?";

			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);
			ps.executeUpdate();
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

	public void delete(String id) {
		try {
			String sql = "delete from member where id = ?";

			ps = con.prepareStatement(sql);
			ps.setString(1, id);
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
}
