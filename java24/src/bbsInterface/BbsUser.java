package bbsInterface;

import java.util.ArrayList;

public class BbsUser {
	public static void main(String[] args) {
		BbsDTO dto = new BbsDTO("kim", "kim", "kim", "kim");
		BbsDAO dao = new BbsDAO();
		dto = dao.delete("kim", dto);
		System.out.println(dto);
	}
}
