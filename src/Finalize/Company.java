package Finalize;

public class Company {
	
//	in summary, finally is used for exception handling, final is used to make elements unchangeable or
//	non-extendable, and finalize is a method used for cleanup before an object is garbage collected.

	String name;

	public static void main(String[] args) {

		Company c = new Company();
		c = null;
		//c.name = "IBM";
		Employee e = new Employee();
		e = null;
		//System.gc();
	}
	
	@Override
	public void finalize() {
		System.out.println("comp -- finalize method....");
	}

}