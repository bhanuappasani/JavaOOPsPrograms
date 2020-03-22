package globalerpclass1.org;

public class Operations {
	
	  /* This method will explain how the Arithmetic Operators ('+','-','*','/','%')
	     can be used */
	  public void arithameticOperators() {
	  
		  int a = 2, b = 3, c = 6, d;
		 
		  d = a + b;
		 
		  System.out.println(d);
		  System.out.println(d - c); 
		  System.out.println(a * c);
		  System.out.println(c / b);
		  System.out.println(c % a);
	  }
	  /* This method will explain how the Relational Operators 
	   * comparison ('>','<','<=','>=')
	   * equality ('==','!=')
	     can be used */
	  public void relationalOperators() {
		  
		  int a = 10, b = 20, c = 5, d = 10;
		  
		  if (a > b) {
			  System.out.println("A is greater then B"); }
		  else if (b < c) {
			  System.out.println("B is lesser then C"); }
		  else if (a == c){
			  System.out.println("Both A and C are equal");
		  }
		  else if (d != a) {
			  System.out.println("Both D and A are not equal");
		  }
		  else if (a <= c) {
			  System.out.println("A is lesser then or equal to C");
		  }
		  else if (b >= a){
			  System.out.println("B is greater then or equal to A");
		  }
	  }
	  
	  /* This method will explain how the Unary Operators 
	   * postfix ('expr++','expr--')
	   * prefix ('++expr','--expr','~','!')
	     can be used */	  
	  public void unaryOperators() {
		  
		  int x= 10, y= 20, z = 10;
		  boolean a = true, b = false;
		  
		  System.out.println(x++); //Before incrementing x as + 1 we are printing, now x = 11
		  System.out.println(++x); //After incrementing + 1, we are printing now x = 12
		  System.out.println(--y); //After decrementing - 1, we are printing now y = 19
		  System.out.println(y--); //Before decrementing y as - 1 we are printing, now x = 18
		  System.out.println(~z); //-11 (minus of total positive value which starts from 0)
		  System.out.println(!a); //false (opposite of boolean value) 
		  System.out.println(!b); //true
	  }
	  
	  /* This method will explain how the Shift Operators 
	   * Left Shift ('<<')
	   * Right Shift ('>>','>>>')
	     can be used */
	  public void shiftOperators() {
		  
		  System.out.println(10<<2); //10*2^2 = 10 * 4 = 40
		  System.out.println(10<<3); //10*2^3 = 10 * 8 = 80
		  
		  //For positive number, >> and >>> works same
		  System.out.println(10>>2); //10/2^2 = 10 / 4 = 2
		  System.out.println(10>>>2); //10/2^2 = 10 / 4 = 2
		  
		  //For negative numbers, >>> changes parity bit
		  System.out.println(-20>>2); //-20/2^2 = -20 / 4 = -5
		  System.out.println(-20>>>2);
	  }

	  /* This method will explain how the Logical Operators 
	   * And ('&&')
	   * OR ('||')
	     can be used */
	  public void logicalOperators() {
		  
		  int a = 10, b = 5, c = 20;
		  
		  System.out.println(a<b&&a<c); //false && true = false
		  
		  System.out.println(a<b&&a++<c); //false && true = false
		  System.out.println(a); //10 because second condition is not checked
		  
		  System.out.println(a>b||a<c); //true || true = true
		  
		  System.out.println(a>b||a++<c); //true || true = true
		  System.out.println(a);//10 because second condition is not checked
	  }

	  /* This method will explain how the Bitwise Operators 
	   * And ('&')
	   * OR ('|')
	   	 can be used */
	  public void bitwiseOperators() {
		  
		  int a = 10, b = 5, c = 20;
		  
		  System.out.println(a<b&a<c); //false & true = false
		  
		  System.out.println(a<b&a++<c); //false & true = false
		  System.out.println(a); //11 because second condition is checked
		  
		  System.out.println(a>b|a<c); //true | true = true
		  
		  System.out.println(a>b|a++<c); //true | true = true
		  System.out.println(a); //11 because second condition is checked
		  
	  }

	  /* This method will explain how the Assignment Operators ('=','+=','-=','*=','/=','%=','^=','&=','|=','<<=','>>=','>>>=')
	   * can be used */
	  public void assignmentOperators() {
		  
		  int a = 10, b = 5;
		  
		  a+=4; // a = a + 4
		  System.out.println(a);
		  
		  b-=2; // b = b - 2
		  System.out.println(b);
		  
		  a*=2; // a = a * 2
		  System.out.println(a);
		  
		  a/=2; // a = a / 2
		  System.out.println(a);
	  }
	 
	
	  /* This is the starting point of the program. 
	  This Main method will execute the provide output */
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operations opera = new Operations();
		
		System.out.println("Hello Java World");
		
		opera.arithameticOperators();
//		opera.relationalOperators();
//		opera.unaryOperators();
//		opera.shiftOperators();
//		opera.logicalOperators();
//		opera.bitwiseOperators();
//		opera.assignmentOperators();
	}
		
}
