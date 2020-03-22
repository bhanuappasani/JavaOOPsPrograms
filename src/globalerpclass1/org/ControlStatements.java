package globalerpclass1.org;

public class ControlStatements {
	
	int age = 60;

	public static void main(String[] args) {
		
		ControlStatements cs = new ControlStatements();

		cs.ifstatement();
		cs.ifelsestatement();
		cs.ifelseTernaryStatement();
		cs.elseifLadder();
		cs.nestedifStatement();
		cs.switchStatement();
	}
	
	public void ifstatement() {
		
		int age = 34;
		
		if(this.age > age) {
			System.out.println("My age is lesser than 60. So I am not senior citizen");
		}	
	}
	
	public void ifelsestatement() {
		
		int number = 13;
		if(number%2==0) {
			System.out.println("Given number is even number");
		}
		else {
			System.out.println("Given number is odd number");
		}
	}
	
	public void ifelseTernaryStatement() {
		/*We can also use Ternary operator (? :) to perform If Else statement. 
		It is shorthand way to check the condition */
		
		int number = 12;
		String output = (number%2==0)?"Even Number":"Odd Number";
		System.out.println(output);
		
	}
	
	public void elseifLadder(){
		
		int age = 23;
		
		if(age == this.age) {
			System.out.println("I am senior citizen");
		}
		else if(age>36 && age<this.age) {
			System.out.println("I am not a senior citizen");
		}
		else if(age>19 && age<36) {
			System.out.println("I am a young man");
		}
		else if(age>12 && age<20) {
			System.out.println("I am a Teenager");
		}
		else {
			System.out.println("I am a Kid");
		}
	}
	
	public void nestedifStatement() {
		
		int weight = 80;
		
		if(age>18) {
			
			if(weight>50) {
				
				System.out.println("You are eligible to donate blood");
			}
		}
	}
	
	/*witch statement tests the equality of a variable against multiple values. 
	It is like if-else-if ladder statement */
	public void switchStatement() {
		
		//Declaring a variable for switch expression  
		String day = "Monday";
		
		//Switch Expression
		switch(day) {
		
		//Case statements
		case "Sunday": System.out.println("Today is Sunday");
		break;
		
		case "Monday": System.out.println("Today is Monday");
		break;
		
		case "Tuesday": System.out.println("Today is Tuesday");
		break;
		
		case "Webnesday": System.out.println("Today is Wednesday");
		break;
		
		case "Thursday": System.out.println("Today is Thursday");
		break;
		
		case "Friday": System.out.println("Today is Friday");
		break;
		
		case "Saturday": System.out.println("Today is Saturday");
		break;
		
		//Default case statement
		default:System.out.println("Given day is not in the list");
		}
	}

}
