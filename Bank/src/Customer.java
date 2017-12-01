
public class Customer {
	private String first;
	private String last;
	private Account acct;
	
	public Customer(String a, String b, Account c) {
		first = a;
		last = b;
		acct = c;
	}
	
	public void getCustomer() {
		System.out.println("Name:" + first + last);
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public Account getAcct() {
		return acct;
	}
}
