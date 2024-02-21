package accessModifier;


public class BMW extends Car{

	public static void main(String[] args) {

		
		BMW b = new BMW();
		b.color = "Red";
		
		
	}

}
//
//public: Accessible everywhere.
//protected: Accessible within the package and by subclasses.
//Default (no modifier): Accessible only within the package.
//private: Accessible only within the class.

