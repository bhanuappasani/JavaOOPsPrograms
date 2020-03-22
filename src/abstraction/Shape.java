package abstraction;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Class_Shape triangleShape = new Subclass_Triangle(); //Object is provided through method, e.g., getShape() method
		triangleShape.draw();
		
		Abstract_Class_Shape rectangleShape = new Subclass_Rectangle();
		rectangleShape.draw();
	}

}
