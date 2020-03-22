package methodOverloading;

public class MethodOverLoading_With_TypePromotion2 {

	//If there are matching type arguments in the method, type promotion is not performed.
	public void sum(int a, int b) {
		System.out.println("int arguments are invoked");
	}
	
	public void sum(long a, long b) {
		System.out.println("long arguments are invoked");
	}
	
	public static void main(String[] args) {
		
		MethodOverLoading_With_TypePromotion2 typePromotion2 = new MethodOverLoading_With_TypePromotion2();
		
		typePromotion2.sum(20, 20); //now int arg sum() method gets invoked 

	}

}
