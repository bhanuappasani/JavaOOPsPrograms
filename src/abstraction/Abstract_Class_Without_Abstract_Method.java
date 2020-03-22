package abstraction;

//An abstract class must be declared with an Abstract keyword
public abstract class Abstract_Class_Without_Abstract_Method {
	
	//It can have abstract and non-abstract methods.
	public void run() {
		System.out.println("This is a Non Abstract Method");
	}
	
	public void draw() {
		System.out.println("This is a Non Abstract Method");
	}
	
	// Abstract class can have static method
	public static void dispaly() {
		System.out.println("This is a Static Method");
	}
	
	// Abstract class can have final method
	public final void shape() {
		System.out.println("This is a Fianl Method");
	}
}
