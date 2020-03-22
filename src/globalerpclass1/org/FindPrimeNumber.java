package globalerpclass1.org;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		boolean status = true;
		for(int i = 2; i<= n/2; i++) {
			
			if (n%i == 0) {
				
				System.out.println("Given number is not a Prime number.");
				status = false;
				break;
			}
			if(status == true ) {
				System.out.println("Given number is a Prime numbre.");
			}
		}

	}

}
