package superKeyword;

public class ChildClass extends ParentClass {

	public int studentID = 1002;
	public String studentName = "Prasad";
	public double studentScore = 91.4;
	public String college = "Vikhas";

	public ChildClass() {
		System.out.println("Child Class Student Details:");
	}
	public void display() {
		
		//super keyword is used to access the data member of immediate parent class
		System.out.println("College: "+super.college+" ID: "+studentID+" Name: "+studentName+" Score: "+studentScore+"%");
		
		//Super keyword is used to access the method of immediate parent class
		super.display();
	}
	
	public static void main(String[] args) {
		
		//As we know well that default constructor is provided by compiler automatically 
		//if there is no constructor. But, it also adds super() as the first statement.
		ParentClass pClass = new ChildClass();

		pClass.display();

	}

}
