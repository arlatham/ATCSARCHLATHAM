
public class Salary {

	private double annual;
	
	public Salary(double salary) {
		if (salary>0) {
			annual = salary;
		}		
		if (salary<0) {
			annual = 0;
			System.out.println("Invalid salary, salary set to 0");
		}
	}
	
	public void setSalary(double salary) {
		if (salary>0) {
			annual = salary;
		}
		if (salary<0) {
			annual = 0;
			System.out.println("Invalid salary, salary set to 0");
		}
	}
	
	public double getSalary() {
		return annual;
	}
}
