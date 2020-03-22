package interfacePackage;

public class Class_Implements_Methodless_Interface implements Interface_Without_Method {

	public static void main(String[] args) {

		System.out.println("Interface static final Number is: "+Interface_Without_Method.number);
		System.out.println("Interface static final Name is: "+Interface_Without_Method.name);
		System.out.println("Interface static final Decimal is: "+Interface_Without_Method.decimal);
		System.out.println();
		
		Class_Implements_Methodless_Interface cimi = new Class_Implements_Methodless_Interface();
		
		//The final variable/field cannot be changed. It will be constant. 
		//cimi.number = 6;
		System.out.println("Interface instantiated final Number is: "+cimi.number);
		System.out.println("Interface instantiated final Name is: "+cimi.name);
		System.out.println("Interface instantiated final Decimal is: "+cimi.decimal);
		System.out.println();
		
		Interface_Without_Method intMethod = new Class_Implements_Methodless_Interface();
		
		System.out.println("Interface reference final Number is: "+intMethod.number);
		System.out.println("Interface reference final Name is: "+intMethod.name);
		System.out.println("Interface reference final Decimal is: "+intMethod.decimal);	

	}

}
