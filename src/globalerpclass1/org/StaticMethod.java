package globalerpclass1.org;

public class StaticMethod {

	//If we apply 'Static' keyword in front of a Method, then it is known as static method
	//A static method belongs to the class rather than the object of a class.
	//A static method can be invoked without the need for creating an instance of a class.
	
	public static int cube(int n) {
		return n*n*n;
	}
	
	//public int a = 40;
	
	public static void main(String[] args) {
		
		int result = cube(5);
		
		System.out.println(result);
		
		//System.out.println(a);

	}

}
