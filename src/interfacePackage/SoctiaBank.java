package interfacePackage;

//A Class can implements multiple interface, it is known as multiple Inheritance.
//A class implements an interface, but one interface extends another interface.
public class SoctiaBank implements InsuranceInterface {

	public double interest() {
		return BankInterface.interestRate;
	}
	
	public int interestRate() {
		return InsuranceInterface.rateOfInterest;
	}
}
