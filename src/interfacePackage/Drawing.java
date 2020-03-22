package interfacePackage;

//Interface is defined by someone else 
interface Shape {
	void draw();
}

//Implementation is provided by different implementation providers
class Rectangle implements Shape {
	
	public void draw() {
		System.out.println("Draw a Rectangle Shape");
	}
}

class Triangle implements Shape {
	
	public void draw() {
		System.out.println("Draw a Triangle Shape");
	}
}

//Interface is used by someone else. The implementation part is hidden by the user who uses the interface.
public class Drawing {

	public static void main(String[] args) {

		Shape shape1 = new Triangle(); //object is provided by method e.g. getShape()
		shape1.draw();
		
		Shape shape2 = new Rectangle();
		shape2.draw();

	}

}
