package accessModifires;

import globalerpclass1.org.*;

public class PublicModifiers {

	public static void main(String[] args) {

		PublicAccessModifiers pModifiers = new PublicAccessModifiers();
		
		System.out.println(pModifiers.number);
		System.out.println(pModifiers.nameString);
		pModifiers.display();

	}

}
