package interfaceLesson;

public class MemberDAO implements MemberInterface {
					  // 구현하다

	@Override
	public void insert(MemberDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("회원가입");
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		System.out.println("회원탈퇴");
	}

	@Override
	public void update(MemberDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("회원수정");
	}

	@Override
	public MemberDTO select(String id) {
		// TODO Auto-generated method stub
		MemberDTO dto = new MemberDTO("park","park","park","park");
		return dto;
	}

}
