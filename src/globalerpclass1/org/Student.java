package globalerpclass1.org;

public class Student {

	String name;
	int id;
	int age;
	static String collegeName = "GlobalERP"; //static variable
	
	//creating a default constructor
	Student(){};
	
	//Creating parameterized constructor
	Student(int i, String n){
		
		id = i;
		name = n;
	}
	
	//Creating constructor overloading
	Student(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}
	
	//method to display the value of id and name 
	public void display() {
		System.out.println(id+" "+name+" "+age);
	}
	
	public void display2() {
		System.out.println(id+" "+name+" "+age+" "+collegeName);
	}
	
	public static void main(String[] args) {
		
		//Creating Object
		Student s1 = new Student();
		//Displaying values of the Object
		s1.display();
		
		//Creating one more Object
		Student s2 = new Student(101,"Bhanu");
		//Displaying values of the Object
		s2.display2();
		
		//Creating one more Object
		Student s3 = new Student(1001,"Ravi",34);
		//Displaying values of the Object
		s3.display();
	}

}
