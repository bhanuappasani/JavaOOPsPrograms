package globalerpclass1.org;

import superKeyword.Person_ParentCalss;

public class Employee_SubClass extends Person_ParentCalss {

	double salary;
	
	public Employee_SubClass(int id, String name, double salary) {
		
		super(id,name);
		
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee Name:"+name+" Employee ID:"+id+" Employee Salary:"+salary);
	}
	public static void main(String[] args) {
		
		Employee_SubClass emp = new Employee_SubClass(101, "Prasad", 20034.56);
		emp.display();

	}

}
