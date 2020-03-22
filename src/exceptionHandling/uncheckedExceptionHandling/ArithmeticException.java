package exceptionHandling.uncheckedExceptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {

		try {
			//code that may raise exception
			int number = 100/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("rest of code....");
	}

}
