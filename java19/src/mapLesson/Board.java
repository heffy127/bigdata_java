package mapLesson;

public class Board {
	String title;
	String content;
	String writer;
	String password;
	public Board(String title, String content, String writer, String password) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + ", password=" + password + "]";
	}
	
}
