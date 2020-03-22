package interfacePackage;

public class Bank extends SoctiaBank {

	public static void main(String[] args) {
		
		SoctiaBank sBank = new Bank();
		System.out.println("Rate Of Interest on Investments: "+sBank.interest()+"%");
		System.out.println("Rate Of Interest on Insurance: "+sBank.interestRate()+"%");
	}

}
