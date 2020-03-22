package globalerpclass1.org;

//Class cannot be private or protected except nested class.

class WithPrivateModifiers {
	
	//The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
	private int number = 30;
	public String nameString = "Bhanu";
	private void method() {
		System.out.println("Hello Private Modifires");
	}
}

class PrivateConstructor {
	
	//private constructor
	private PrivateConstructor() {
		System.out.println("This class has private constructor");
	};
}

public class PrivateAccessModifiers {

	public static void main(String[] args) {	
		
		WithPrivateModifiers pModifiers = new WithPrivateModifiers();
		
		//System.out.println(pModifiers.number); //Compile Time Error
		
		System.out.println(pModifiers.nameString);
		
		//pModifiers.method(); //Compile Time Error
		
		//PrivateConstructor pConstructor = new PrivateConstructor(); //Compile Time Error
	}
}