package abstraction;

import interfacePackage.TestInterface;

public abstract class TestAbstractCalss implements TestInterface{
	
	public void testA() {
		System.out.println("I am A");
	}
	
	public void testB() {
		System.out.println("I am B");
	}
	
	public abstract void testC();
	
	public abstract void testD();
}
