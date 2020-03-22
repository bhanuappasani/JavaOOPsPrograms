package abstraction;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract_Class_Bank scotiaBank = new ScotiaBank();
		scotiaBank.bankNameString = "Nova Scotia Bank";
		System.out.println("Bank Name: "+scotiaBank.bankName());
		System.out.println("Rate of Interest: "+scotiaBank.interest()+"%");
		scotiaBank.loan();
		
		Abstract_Class_Bank roayalBank = new RoyalBank();
		roayalBank.bankNameString = "Royal Bank Of Canada";
		System.out.println("Bank Name: "+roayalBank.bankName());
		System.out.println("Rate of Interest: "+roayalBank.interest()+"%");
		roayalBank.loan();

	}

}
