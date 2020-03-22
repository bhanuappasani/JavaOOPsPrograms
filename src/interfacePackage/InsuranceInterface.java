package interfacePackage;

/* Like classes, the interface contains methods and variables. An interface can
 * extend any number of interfaces but one interface cannot implement another
 * interface, because if any interface is implemented then its methods must be
 * defined and interface never has the definition of any method. 
 * 
 * public interface InsuranceInterface implements BankInterface {}
 */
//Interface inheritance
public interface InsuranceInterface extends BankInterface {
	
	int interestRate();
	int rateOfInterest = 10;
}