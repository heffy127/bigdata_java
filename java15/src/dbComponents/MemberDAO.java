package dbComponents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	int res = 0;

	public MemberDAO() {
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

	public void insert(MemberDTO dto) {
		try {
			String sql = "insert into member values(?,?,?,?)";

			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
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

	public MemberDTO select(MemberDTO dto) {
		MemberDTO mdto = new MemberDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "12341234";
			con = DriverManager.getConnection(url, user, password);

			String sql = "select * from member where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			rs = ps.executeQuery();
			if (rs.next()) { // boolean으로 반환
				mdto.setId(rs.getString("id"));
				mdto.setPw(rs.getString("pw"));
				mdto.setName(rs.getString("name"));
				mdto.setTel(rs.getString("tel"));
			} else {
				System.out.println("검색 결과가 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mdto;
	}

	public void update(MemberDTO dto) {
		try {
			String sql = "update member set tel = ? where id = ?";

			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTel());
			ps.setString(2, dto.getId());
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

	public void delete(MemberDTO dto) {
		try {
			String sql = "delete from member where id = ?";

			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
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
