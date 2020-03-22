package methodOverriding;

public class MethodOverriding_BankRateOfInterest {

	public static void main(String[] args) {

		MethodOverriding_SBI sbi = new MethodOverriding_SBI();
		MethodOverriding_Axis axis = new MethodOverriding_Axis();
		MethodOverriding_ICICI icici = new MethodOverriding_ICICI();
		
		System.out.println("Rate of Interest in SBI Bank: "+sbi.getRatOfInterest());
		System.out.println("Rate of Interest in AXIS Bank: "+axis.getRatOfInterest());
		System.out.println("Rate of Interest in ICICI Bank: "+icici.getRatOfInterest());

	}

}
