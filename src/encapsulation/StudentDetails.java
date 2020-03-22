package encapsulation;

public class StudentDetails {

	private String studName, studGroup, collageName = "Narayana";
	private int studAge;
	private int studMarks;
	
	public String getStud_Name() {
		return studName;
	}
	
	public void setStud_Name(String name) {
		studName = name;
	}
	
	 public String getStud_Group() { return studGroup; }
	 
	
	public void setStud_Group(String group) {
		studGroup = group;
	}
	
	public String get_CollageName() {
		return collageName;
	}
	
	/*
	 * public void set_CollageName(String collageName) { this.collageName =
	 * collageName; }
	 */
	
	public int getStud_Age() {
		return studAge;
	}
	
	public void setStud_Age(int age) {
		studAge = age;
	}
	
	public int getStud_Marks() {
		return studMarks;
	}
	
	public void setStud_Marks(int marks) {
		studMarks = marks;
	}
}
