package interfacePackage;

//An interface is declared by using the interface keyword
public interface Interface_With_Method {
	
	//Method in Interface is declared with the empty body
	void display();

}

class Class_Implements_Interface_With_Method implements Interface_With_Method {
	
	public void display() {
		System.out.print("This is Interface implemented with Class");
	}
}
