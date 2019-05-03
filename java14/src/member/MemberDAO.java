package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	int res = 0;

	public MemberDAO() {
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

	public void insertMember(MemberDTO dto) {
		try {
			String sql = "insert into membership(tel, name) values(?, ?)";

			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTel());
			ps.setString(2, dto.getName());
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

		public void plusStamp(MemberDTO dto) {
			try {
				String sql = "update membership set stamp = stamp + 1 where tel = ?";
				
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getTel());
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
		
		public void deleteMember(MemberDTO dto) {
			try {
				String sql = "delete from membership where tel = ?";
				
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getTel());
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
		
		public void UseStamp(MemberDTO dto) {
			try {
				String sql = "update membership set stamp = stamp - 10 where tel = ?";
				
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getTel());
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
