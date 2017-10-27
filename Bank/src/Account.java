public class Account {
	
	private double balance = 0.0;
		
	public Account(double initBalance) {	
		balance = initBalance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		if (amt >= 0)
			balance += amt;	
		if (amt < 0)
			System.out.println("Invalid deposit value");
	}
	
	public void withdrawl(double amt) {
		if (amt <= 0)
			System.out.println("Invalid withdrawl value");
		
		if (amt > balance)
			System.out.println("You do not have enough money");
		
		if (amt <= balance)
			balance -= amt;			
	}
}

