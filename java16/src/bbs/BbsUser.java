package bbs;

import java.util.ArrayList;

public class BbsUser {
	public static void main(String[] args) {
		BbsDAO2 dao = new BbsDAO2();
		ArrayList list = dao.selectAll();
		System.out.println(list.size());
		System.out.println(list);
	}
}
