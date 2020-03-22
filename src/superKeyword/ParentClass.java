package superKeyword;

public class ParentClass {
	
	public int studentID = 1001;
	public String studentName = "Bhanu";
	public double studentScore = 89.5;
	public String college = "Narayana";
	public ParentClass() {
		System.out.println("Parent Class Student Details:");
	}
		
	public void display() {
		System.out.println("College: "+college+" ID: "+studentID+" Name: "+studentName+" Score: "+studentScore+"%");
	}

}
