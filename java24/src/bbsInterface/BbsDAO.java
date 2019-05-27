package bbsInterface;

public class BbsDAO implements BbsInterface {

	@Override
	public void insert(BbsDTO dto) {

	}

	@Override
	public void select(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public BbsDTO delete(String id, BbsDTO dto) {
		if(dto.getId().equals(id))
		dto = new BbsDTO(" "," "," "," ");
		return dto;
	}

	@Override
	public void update(BbsDTO dto) {
		
	}

}
