package instanceInitializerBlock;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		
		super();
		System.out.println("Child class constructor is invoked");
	}
	
	public ChildClass(int a) {
		super();
		System.out.println("Child class parameterized constructor is invoked "+ a);
	}
	
	{System.out.println("Instance initializer Block is invoked");}

	public static void main(String[] args) {
		/*
		 * Instance Initializer Block is created when instance of the class is created.
		 * Instance Initializer Block is invoked after parent class constructor is
		 * invoked (i.e. after super() constructor call). 
		 * Instance Initializer Block comes in the order in which they appear.
		 * The java compiler copies the code of instance initializer block in every constructor.
		 */
		ChildClass cClass = new ChildClass();
		ChildClass cClass1 = new ChildClass(30);

	}

}
