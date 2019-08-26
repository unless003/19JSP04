package Lab;

public class CongNhan  extends CanBo{
	private String rank;

	public CongNhan(String name, String address, String gender, int birthday , String rank) {
		super(name, address, gender, birthday);
		this.rank=rank;
		
		// TODO Auto-generated constructor stub
	}

	public String getrank() {
		return rank;
	}

	public void setrank(String rank) {
		this.rank = rank;
	}

}
