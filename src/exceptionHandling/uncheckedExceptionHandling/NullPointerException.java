package exceptionHandling.uncheckedExceptionHandling;

public class NullPointerException {

	public static void main(String[] args) {

		try {
			String nameString = null;
			//int lenght = nameString.length();
			System.out.println(nameString.length());
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of code...");
	}

}
