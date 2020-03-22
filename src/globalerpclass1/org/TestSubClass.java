package globalerpclass1.org;

import abstraction.TestAbstractCalss;
import interfacePackage.TestInterface;

public class TestSubClass extends TestAbstractCalss {
	
	public void testC() {
		System.out.println("I am C");
	}

	public void testD() {
		System.out.println("I am D");
	}
	
	public static void main(String[] args) {
		
		/*
		 * TestAbstractCalss tbClass = new TestSubClass();
		 * 
		 * tbClass.testA(); tbClass.testB(); tbClass.testC(); tbClass.testD();
		 */
		
		TestInterface testI = new TestAbstractCalss() {
			
			@Override
			public void testD() {
				// TODO Auto-generated method stub
				System.out.println("I am Abstract Class D method");
			}
			
			@Override
			public void testC() {
				// TODO Auto-generated method stub
				System.out.println("I am Abstract Class C method");
			}
		};
		testI.testA();
		testI.testB();
		
		TestAbstractCalss tbClass = new TestSubClass();
		
		tbClass.testC();
		tbClass.testD();	
	}
}
