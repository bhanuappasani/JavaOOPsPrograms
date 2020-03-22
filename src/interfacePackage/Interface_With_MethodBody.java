package interfacePackage;

public interface Interface_With_MethodBody {

	//Since Java 8, we can have method body in interface. But we need to make it default method.
	default void message() {
		System.out.println("This is a Default method in Interface");
	}
	
	//Since Java 8, we can have static method in interface.
	static void message2() {
		System.out.println("This is a Static method in Inteface");
	}
	
	void message3();
}
