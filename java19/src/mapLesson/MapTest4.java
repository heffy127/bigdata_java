package mapLesson;

import java.util.HashMap;
import java.util.Map;

public class MapTest4 {
	public static void main(String[] args) {
		Map board = new HashMap();
		board.put(100, new Board("첫글", "첫빠", "홍", "1234"));
		board.put(200, new Board("두번째글", "2빠", "나", "1324"));
		board.put(300, new Board("마지막글", "ㅠㅠ", "박", "1227"));
		System.out.println(board.get(100));
		System.out.println(board.get(200));
		System.out.println(board.get(300));
	}
}
