package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
		
		mgr.freeConnection(con, ps); // 메모리에서 사라져라
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
	
	// 제네릭 프로그래밍(객체 생성시 어떤 타입을 쓸지 결정 가능)
	// 형변환 필요없어서 내부적인 처리 속도 더 빠름
	public ArrayList<MemberDTO> selectAll() throws Exception{
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		MemberDTO dto2 = null;
		
		// 이미 만들어져있으면 걔를 얹어주고 아니면 새로 생성
		Connection con = mgr.getConnection();
		
		// 3단계 sql문 결정
		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);
		
		// 4단계 sql문 전달 요총
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			dto2 = new MemberDTO();
			dto2.setId(rs.getString(1));
			dto2.setPw(rs.getString(2));
			dto2.setName(rs.getString(3));
			dto2.setTel(rs.getString(4));
			list.add(dto2);
		}
		return list;
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
