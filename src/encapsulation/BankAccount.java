package encapsulation;

public class BankAccount {
	
	private long accNo;
	private String accHolderName, accHolderEmail;
	private int accMoney;
	
	public long getAcc_No() {
		return accNo;
	}
	
	public void setAcc_No(long accNo) {
		this.accNo = accNo;
	}
	
	public String getAcc_Name() {
		return accHolderName;
	}
	
	public void setAcc_Name(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	
	public String getAcc_Email() {
		return accHolderEmail;
	}
	
	public void setAcc_Email(String accHolderEmail) {
		this.accHolderEmail = accHolderEmail;
	}
	
	public int getAcc_Money() {
		return accMoney;
	}
	
	public void setAcc_Money(int accMoney) {
		this.accMoney = accMoney;
	}

}
