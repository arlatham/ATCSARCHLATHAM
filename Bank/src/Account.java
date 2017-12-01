
public class Account {
	
	protected double balance = 0.0;
		
	public Account(double initBalance) {	
		balance = initBalance;
	}

	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt) {
		boolean a = true;
		if (amt >= 0) {
			balance += amt;	
		}
		if (amt < 0) {
			System.out.println("Invalid deposit value");
			a = false;
		}
		return a;
	}
	
	public boolean withdrawl(double amt) {
		boolean a = true;
		if (amt <= 0) {
			System.out.println("Invalid withdrawl value");
			a = false;
		}
		
		if (amt > balance) {
			System.out.println("You do not have enough money");
			a = false;
		};
		
		if (amt <= balance) {
			balance -= amt;	
		}
		return a;			
	}
}

