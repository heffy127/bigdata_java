package interfaceLesson;
//	강제성 있는 기능을 정의
public interface MemberInterface {
	
	public abstract void insert(MemberDTO dto);
	public abstract void delete(String id);
	public abstract void update(MemberDTO dto);
	public abstract MemberDTO select(String id);
	// 이런 메소드들이 반드시 구현되어야 해
	// 기능만 정의하고 내용은 X
}
