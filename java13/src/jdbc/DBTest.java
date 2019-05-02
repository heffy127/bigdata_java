package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBTest {
	public static void main(String[] args) throws Exception {
		//1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK...");
		
		//2. DB 연결 (db명, id, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "12341234";
		// return 되는 connection을 넘겨 받음
		Connection con = DriverManager.getConnection(url,user,password); 
		System.out.println("2. DB연결 성공");
		
		//3. SQL 결정
		String sql = "insert into member values('lee','lee','lee','lee')";
								// String sql을 'SQL객체'로 만들어줌
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 결정 완료");
		
		//4. SQL 전송
		int res = ps.executeUpdate();
	}
}
