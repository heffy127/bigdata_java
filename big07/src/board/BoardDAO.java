package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDAO {
	public void insert(BoardDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/site";
			String user = "root";
			String password = "1234";
			String sql = "insert into board values(?,?,?)";
			
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContents());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public BoardDTO select(String title) {
		BoardDTO dto = new BoardDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/site";
			String user = "root";
			String password = "1234";
			String sql = "select * from board where title = ?";
			
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setTitle(rs.getString("title"));
				dto.setContents(rs.getString("contents"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}
