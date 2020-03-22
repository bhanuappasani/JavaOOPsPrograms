package abstraction;

public class ScotiaBank extends Abstract_Class_Bank {

	protected int interest() {
		return 7;
	}

	protected void loan() {
		System.out.println("Take a Loan in Scotia Bank");
	}

}
