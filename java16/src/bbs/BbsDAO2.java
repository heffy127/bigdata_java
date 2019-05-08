package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BbsDAO2 {
	// CRUD
	// 각각을 메소드로 만들어야 한다.
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user = "root";
	String password = "12341234";
	int res = 0;

	public BbsDTO select(String inputId) {
		// 1. 드라이버 설정
		// 외부파일 사용할 때 예외 처리 필수
		BbsDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 OK");

			// 2. DB연결 (url, user, password)
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK");

			// 3. SQL문 결정 (객체화 필요)
			String sql = "select * from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3. SQL문 객체화 OK");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 OK");

			// SQL문의 결과가 있으면, 받아서 처리
			if (rs.next()) {
				dto = new BbsDTO();
				dto.setId(rs.getString("id"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setEtc(rs.getString("etc"));
			} else {
				System.out.println("검색 결과가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("DB처리 중 에러발생");
			System.out.println(e.getMessage());
		} finally { // 에러 발생 여부 관계 없이 무조건 실행
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			}
		}
		return dto;
	}

	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			String sql = "select * from bbs";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				BbsDTO dto = new BbsDTO();
				dto.setId(rs.getString("id"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setEtc(rs.getString("etc"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			}
		}
		return list;
	}

	public void insert(BbsDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			String sql = "insert into bbs values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getEtc());
			res = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (res != 0)
					ps.close();
				if (res != 0)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void delete(String id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			String sql = "delete from bbs where id = ?";
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(BbsDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			String sql = "update bbs set title = ?, content = ?, etc = ? where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getEtc());
			ps.setString(4, dto.getId());
			res = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (res != 0)
					ps.close();
				if (res != 0)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
