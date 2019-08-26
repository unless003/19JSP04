package Lab;

public class NhanVien extends CanBo {
	private String job;
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public NhanVien(String name, String address, String gender, int birthday, String job) {
		super(name, address, gender, birthday);
		this.job=job;
		// TODO Auto-generated constructor stub
	}

}
