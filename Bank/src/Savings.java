
public class Savings extends Account {

	private double rate;
	
	public Savings(double balance, double interest) {
		super(balance + balance*interest); 
		rate = interest;
	}
	
	
}
