package methodOverloading;

public class MethodOverLoading_With_TypePromotion3 {

	//If there are no matching type arguments in the method, 
	//and each method promotes similar number of arguments, there will be ambiguity.
	public void sum(int a, long b) {
		System.out.println("int arguments are invoked");
	}
	
	public void sum(long a, int b) {
		System.out.println("long arguments are invoked");
	}
	
	public static void main(String[] args) {
		
		MethodOverLoading_With_TypePromotion3 typePromotion3 = new MethodOverLoading_With_TypePromotion3();
		
		//typePromotion3.sum(20, 20); //now ambiguity

	}

}
