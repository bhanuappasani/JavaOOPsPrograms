package globalerpclass1.org;

public class StaticVariable {
	
	//declared a non static variable, will get memory each time when the instance is created 
	//public int count = 0;
	
	//declared a static variable, will get memory only once and retain its value
	public static int count = 0;
	
	
	StaticVariable(){
		
		//incrementing value the value of static variable
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
	
		/*
		 * //Object created for student class with parameterized constructor Student
		 * std1 = new Student(111,"Bhanu",24); //Object calling method std1.display2();
		 * 
		 * Student std2 = new Student(111,"Bhanu",24); //Change the static variable
		 * value Student.collegeName = "StateERP"; std2.display2();
		 */
		
		//Creating Objects
		StaticVariable sv1 = new StaticVariable();
		
		StaticVariable sv2 = new StaticVariable();
				
		StaticVariable sv3 = new StaticVariable();
		
	}

}
