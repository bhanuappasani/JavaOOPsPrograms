package abstraction;

public class Subclass_Of_Abstract_Subclass extends Subclass_Without_Abstract_Method_Implementation{

	public void display() {
		System.out.println("This is abstract method of abstract class");
	}
	
	public void show() {
		System.out.println("This is abstract method of abstract Subclass");
	}
	public static void main(String[] args) {
		
		Subclass_Of_Abstract_Subclass subclass = new Subclass_Of_Abstract_Subclass();
		
		subclass.display();
		subclass.show();

	}

}
