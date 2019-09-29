package bo;

public class customer {
	
	private int ID;
	private String NAME;
	private int AGE;
	private String ADDRESS;
	private double SALARY;
	public customer(int iD, String nAME, int aGE, String aDDRESS, double sALARY) {
		super();
		ID = iD;
		NAME = nAME;
		AGE = aGE;
		ADDRESS = aDDRESS;
		SALARY = sALARY;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public double getSALARY() {
		return SALARY;
	}
	public void setSALARY(double sALARY) {
		SALARY = sALARY;
	}
	public String toString(int ID , String NAME , int AGE, String ADDRESS , double SALARY) {
		return ID + NAME + AGE + ADDRESS +SALARY ;
		
	}
}
