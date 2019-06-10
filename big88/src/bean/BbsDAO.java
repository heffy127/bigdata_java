package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	DBConnectionMgr mgr;
	
	public BbsDAO(){
		mgr = DBConnectionMgr.getInstance();
	}
	
	public void insert(BbsDTO dto) throws Exception{
		Connection con = mgr.getConnection();
		
		String sql = "insert into bbs values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getEtc());
		
		ps.executeUpdate();
	}
	
	public void delete(String title) throws Exception{
		Connection con = mgr.getConnection();
		
		String sql = "delete from bbs where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);
		
		ps.executeUpdate();
	}
	
	public void update(String title, BbsDTO dto) throws Exception{
		Connection con = mgr.getConnection();
		
		String sql = "update bbs set title = ?, content = ?, etc = ? where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getContent());
		ps.setString(3, dto.getEtc());
		ps.setString(4, title);
		
		ps.executeUpdate();
	}
	
	public BbsDTO select(String title) throws Exception{
		BbsDTO dto = null;
		Connection con = mgr.getConnection();
		
		String sql = "select * from bbs where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			dto = new BbsDTO();
			dto.setId(rs.getString(1));
			dto.setTitle(rs.getString(2));
			dto.setContent(rs.getString(3));
			dto.setEtc(rs.getString(4));
		}
		return dto;
	}
}
