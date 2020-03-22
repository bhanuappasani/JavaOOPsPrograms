package exceptionHandling.uncheckedExceptionHandling;

public class NumberFormatException {

	public static void main(String[] args) {

		try {
			String name = "abcd";
			int number = Integer.parseInt(name);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of code...");

	}

}
