package abstraction;

public class RoyalBank extends Abstract_Class_Bank {

	protected int interest() {
		return 8;
	}
	
	protected void loan() {
		System.out.println("Take a Loan in Royal Bank of Canada");
	}
}
