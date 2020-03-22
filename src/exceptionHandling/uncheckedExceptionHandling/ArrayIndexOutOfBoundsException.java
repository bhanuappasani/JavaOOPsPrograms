package exceptionHandling.uncheckedExceptionHandling;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		try {
			
			int[] number = new int[5];
			number[6] = 34;
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of code...");
	}

}
