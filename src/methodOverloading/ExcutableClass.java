package methodOverloading;

public class ExcutableClass {

	public static void main(String[] args) {
		
		System.out.println("Addition of Add method with two arguments: "+MethodOverloading_With_Arguments.add(5, 8));
		
		System.out.println("Addition of Add method with three arguments: "+MethodOverloading_With_Arguments.add(5, 8, 12));

		System.out.println("Addition of Add method with Double type: "+MethodOverloading_With_DataTypes.add(4.4, 5.5));
		
		System.out.println("Addition of Add method with Int type: "+MethodOverloading_With_DataTypes.add(6, 9));
	}

}
