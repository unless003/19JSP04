package Lab;

public class KySu extends CanBo{
	private String training;
	public String getTraining() {
		return training;
	}
	public void setTraining(String training) {
		this.training = training;
	}
	public KySu(String name, String address, String gender, int birthday,String training) {
		super(name, address, gender, birthday);
		this.training = training;
		// TODO Auto-generated constructor stub
	}

}
