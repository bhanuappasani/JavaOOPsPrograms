package globalerpclass1.org;

public class StaticBlock {
	
	//It is executed before the main method at the time of class loading
	
	static {
		
		System.out.println("Static block is invoked");
	}

	public static void main(String[] args) {

		System.out.println("Hello Main block");

	}

}
