package abstraction;

// Abstract class need to extended and its method implemented.
public class Subclass_Of_Abstractclass extends Abstract_Class_Without_Abstract_Method {
	
	// This method is override of Abstract_Class_Without_Abstract_Method class 
	public void run() {
		System.out.println("This is a Override Method in Subclass");
	}
	
	// This method is belongs to this subclass. 
	//It is not same as Abstract_Class_Without_Abstract_Method class static method.
	public void display() {
		System.out.println("This is a Subclass Method");
	}
	
	//Any method as final, we cannot override it.
	/*
	 * public void shape() { System.out.println("This is a Subclass Method"); }
	 */
	
	public static void main(String[] args) {
		
		//An abstract class can not be instantiated
		//Abstract_Class_Without_Abstract_Method abstractClass_Object = new Abstract_Class_Without_Abstract_Method() 
		
		Subclass_Of_Abstractclass subclass = new Subclass_Of_Abstractclass();
		
		Abstract_Class_Without_Abstract_Method.dispaly();
		
		subclass.draw();
		subclass.run();
		subclass.display();
		subclass.shape();
	}

}
