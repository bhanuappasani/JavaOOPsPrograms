package interfacePackage;

public class Class_Implements_Interface_With_Methodbody implements Interface_With_MethodBody {

	public void message3() {
		System.out.println("This is a Abstract method in Interface");
	}
	
	public static void main(String[] args) {

		Interface_With_MethodBody methodBody = new Class_Implements_Interface_With_Methodbody();
		methodBody.message();
		methodBody.message3();
		Interface_With_MethodBody.message2();
	}

}
