package abstraction;

//If you are extending an abstract class that has an abstract method, 
//you must either provide the implementation of the method or make this class abstract.
/*public class Subclass_Without_Abstract_Method_Implementation extends Class_With_Abstract_Method {

	public void show() {
		System.out.println("");
	}
}*/

public abstract class Subclass_Without_Abstract_Method_Implementation extends Class_With_Abstract_Method {

	public abstract void show();

}
