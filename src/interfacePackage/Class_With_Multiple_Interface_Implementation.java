package interfacePackage;

interface Printable{  
	void print();  
} 

interface Showable{  
	void print();  
}  

//A Class can implements multiple interface, it is known as multiple Inheritance.
public class Class_With_Multiple_Interface_Implementation implements Printable, Showable {

	public void print() {
		System.out.println("Hello Welcome to Multipul Interface");
	}
	
	public static void main(String[] args) {
		
		Printable printInterface = new Class_With_Multiple_Interface_Implementation();
		printInterface.print();
		
		Showable showInterface = new Class_With_Multiple_Interface_Implementation();
		showInterface.print();
		
		Class_With_Multiple_Interface_Implementation cwmii = new Class_With_Multiple_Interface_Implementation();
		cwmii.print();

	}

}
