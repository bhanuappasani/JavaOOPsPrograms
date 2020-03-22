package globalerpclass1.org;

class DefaultModifiers {
	
	//If you don't use any modifier, it is treated as default by default.
	// Default class members
	int number = 30;
	String nameString = "Bhanu";
	// Default class method
	void display() {
		System.out.println("This is a Defualt modifier method");
	}
}
public class DefaultAccessModifiers {
	
	public static void main(String[] args) {
		
		DefaultModifiers dModifiers = new DefaultModifiers();
		
		//The default modifier is accessible only within package
		System.out.println(dModifiers.number);
		System.out.println(dModifiers.nameString);
		dModifiers.display();
	}

}
