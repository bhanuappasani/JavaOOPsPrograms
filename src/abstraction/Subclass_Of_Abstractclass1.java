package abstraction;

public class Subclass_Of_Abstractclass1 extends Abstract_Class_With_Abstract_Method {
	
	public void run() {
		System.out.println("Running safely");
	}
	
	public static void main(String[] args) {
		
		Abstract_Class_With_Abstract_Method subClass = new Subclass_Of_Abstractclass1();
		
		subClass.run();
	}

}
