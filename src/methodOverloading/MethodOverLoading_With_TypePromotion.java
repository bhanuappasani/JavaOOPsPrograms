package methodOverloading;

public class MethodOverLoading_With_TypePromotion {

	public void sum(int a, long b) {
		System.out.println("Sum of two arguments: "+(a+b));
	}
	
	public void sum(int a, int b, int c) {
		System.out.println("Sum of three arguments: "+(a+b+c));
	}
	
	public static void main(String[] args) {
		
		MethodOverLoading_With_TypePromotion typePromotion = new MethodOverLoading_With_TypePromotion();

		typePromotion.sum(20, 20); //Now second int literal will be promoted to long
		typePromotion.sum(20, 10, 30);
	}

}
