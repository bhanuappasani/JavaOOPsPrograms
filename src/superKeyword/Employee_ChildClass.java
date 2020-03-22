package superKeyword;

public class Employee_ChildClass extends Person_ParentCalss {

	double salary;
	
	Employee_ChildClass(int id, String name, double salary) {
		
		super(id, name);//reusing parent constructor
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee Name:"+name+" Employee ID:"+id+" Employee Salary:"+salary);
	}
	public static void main(String[] args) {
		
		Employee_ChildClass emp = new Employee_ChildClass(1001, "Bhanu", 19000.56);
		
		emp.display();

	}

}
