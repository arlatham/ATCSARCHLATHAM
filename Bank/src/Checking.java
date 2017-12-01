
public class Checking extends Account{

	private double overdraft;
	
	public Checking(double balance, double positveoverdraft) {
		super(balance);
		overdraft = -positveoverdraft;
	}
	
	
}
