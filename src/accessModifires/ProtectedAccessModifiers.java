package accessModifires;

import globalerpclass1.org.*;

//The protected access modifier is accessible within package and outside the package but through inheritance only
public class ProtectedAccessModifiers extends ProtectedModifiers {

	public static void main(String[] args) {
		
		ProtectedAccessModifiers pModifiers = new ProtectedAccessModifiers();
		
		System.out.println(pModifiers.number);
		System.out.println(pModifiers.nameString);
		pModifiers.display();

	}

}