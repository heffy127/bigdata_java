package bbsInterface;

public interface BbsInterface {
	public void insert(BbsDTO dto);
	public void select(String id);
	public BbsDTO delete(String id, BbsDTO dto);
	public void update(BbsDTO dto);
}
