package exceptionHandling.checkedExceptionHandling;

import java.io.PrintWriter;

public class FileNotFoundException {

	public static void main(String[] args) {

		PrintWriter pw;
		
		try {
			pw = new PrintWriter("abcd.txt");
			pw.println("saved");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}

}
