package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	DBConnectionMgr mgr;
	
	public MemberDAO() { // 생성자 안에 Connection
		// 1,2단계를 해주는 DBConnectionMgr 객체 필요
		mgr = DBConnectionMgr.getInstance();

	}

	public void insert(MemberDTO dto) throws Exception{
		// 이미 만들어져있으면 걔를 얹어주고 아니면 새로 생성
		Connection con = mgr.getConnection();

		// 3단계 sql문 결정
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());

		// 4단계 sql문 전달 요총
		ps.executeUpdate();
	}
	public void update(MemberDTO dto) throws Exception{
		// 이미 만들어져있으면 걔를 얹어주고 아니면 새로 생성
		Connection con = mgr.getConnection();

		// 3단계 sql문 결정
		String sql = "update member set id = ?, pw = ?, name = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		ps.setString(5, dto.getId());
		System.out.println(dto.getId());

		// 4단계 sql문 전달 요총
		ps.executeUpdate();
	}
	
	public MemberDTO select(MemberDTO dto) throws Exception{
		// 이미 만들어져있으면 걔를 얹어주고 아니면 새로 생성
		MemberDTO dto2 = null;
		Connection con = mgr.getConnection();
		
		// 3단계 sql문 결정
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		// 4단계 sql문 전달 요총
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			dto2 = new MemberDTO();
			dto2.setId(rs.getString(1));
			dto2.setPw(rs.getString(2));
			dto2.setName(rs.getString(3));
			dto2.setTel(rs.getString(4));
		}
		return dto2;
	}
	
}
