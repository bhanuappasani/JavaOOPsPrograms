package exceptionHandling.uncheckedExceptionHandling;

import java.io.*;

public class MultipleTryCatchBlocks {

	public static void main(String[] args) {
		
		try {
				int number = 39/0;
			}
			//catch(ArithmeticException e) { System.out.println("Arithemetic Execption Occurs");}
					
			//catch(ArrayIndexOutOfBoundsException e) {System.out.println("ArrayIndexOutOfBounds Exception Occurs");}
				
			catch(Exception e) {System.out.println("Parent Exception occurs");}
				
		System.out.println("Rest of the code....");

	}
	
}
