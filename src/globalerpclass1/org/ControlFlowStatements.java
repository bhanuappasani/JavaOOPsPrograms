package globalerpclass1.org;

public class ControlFlowStatements {

	public static void main(String[] args) {
		
		ControlFlowStatements cfs = new ControlFlowStatements();
		
		//cfs.dowhileloop();
		//cfs.whileloop();
		//cfs.forloop();
		cfs.nestedforloop();
		cfs.foreachloop();
	}
	
	/*'Do while loop' is a control flow statement that 
	executes a part of the 'programs' at least once and 
	the further execution depends upon the given 'boolean condition'.
	
	 *If the number of iteration is not fixed and 
	 * you must have to execute the loop at least once, 
	 * it is recommended to use the do-while loop */
	public void dowhileloop() {
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i>10);
	}
	
	/*'While loop' is a control flow statement that 
	 * executes a part of the 'programs' repeatedly 
	 * on the basis of given 'boolean condition'.
	 * 
	 * If the number of iteration is not fixed, 
	 * it is recommended to use while loop.*/
	public void whileloop() {
		int i = 10;
		
		while(i<=15) {
			System.out.println(i);
			i++;
		}
	}
	
	/*'For loop' is a control flow statement that 
	 * iterates a part of the 'programs' multiple times.
	 * 
	 * If the number of iteration is fixed, 
	 * it is recommended to use for loop.*/
	public void forloop() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public void nestedforloop() {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/**/
	public void foreachloop() {
		
		int[] i = {2,3,5,7,11};
		
		for(int j:i) {
			System.out.println(j);
		}
	}
}
