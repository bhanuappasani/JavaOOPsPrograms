package encapsulation;

public class Student {

	public static void main(String[] args) {
		
		StudentDetails student = new StudentDetails();
		
		student.setStud_Name("Bhanu");
		student.setStud_Group("MPC");
		//student.set_CollageName("New Generation");
		student.setStud_Age(16);
		student.setStud_Marks(465);
		
		System.out.println(student.getStud_Name());
		System.out.println(student.getStud_Group());
		System.out.println(student.get_CollageName());
		System.out.println(student.getStud_Age());
		System.out.println(student.getStud_Marks());
	}

}