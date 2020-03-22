package encapsulation;

public class AccountDetails {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		account.setAcc_No(648651852);
		account.setAcc_Name("Bhanu");
		account.setAcc_Email("bhanua@gmail.com");
		account.setAcc_Money(15000);
		
		System.out.println(account.getAcc_No()+", "+account.getAcc_Name()+", "+account.getAcc_Email()+", "+account.getAcc_Money());

	}

}
