package abstraction;

public abstract class Abstract_Class_Bank {

	//Abstract class can have Constructor
	public Abstract_Class_Bank() {
		System.out.println("Bank Abstract Class is created");
	}
	
	protected abstract int interest();
	
	protected String bankNameString;
	
	protected String bankName() {
		return bankNameString;
	}
	protected void loan() {
		System.out.println("Take a Loan in Bank");
	}
}
