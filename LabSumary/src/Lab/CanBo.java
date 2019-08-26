package Lab;

public class CanBo {
	
	private String name;
	private String address;
	private String gender;
	private int birthday;
	
	public CanBo(String name, String address, String gender, int birthday) {
		super();
		
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
}
