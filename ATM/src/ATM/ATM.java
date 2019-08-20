package ATM;

public interface ATM {

	public boolean widthdraw(int accountId,double withdrawAmount);
	public boolean deposit(int accountId, double depositAmount);
	public double querybalance(int accountId);
	public boolean login(String username , String password);
	public boolean logout(String x);
}
