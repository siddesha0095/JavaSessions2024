package javaSessions;

public class EmployeeClass {

	// class vars:
	String name;
	int age;
	String city;
	double salary;
	char gender;
	boolean isActive;

	public static void main(String[] args) {

		// class - blueprint/template/category
		// Object - a physical entity

		EmployeeClass e1 = new EmployeeClass();
		e1.name = "Tom";
		e1.age = 20;
		e1.city = "Bangalore";
		e1.salary = 12.33;
		e1.gender = 'm';
		e1.isActive = true;
		System.out.println(e1.name + " " + e1.age + " " + e1.isActive);

		EmployeeClass e2 = new EmployeeClass();
		System.out.println(e2.name + " " + e2.age + " " + e2.salary + e2.gender + e2.isActive);

		new EmployeeClass().name = "Naveen";
		// no reference Object
		new EmployeeClass().isActive = true;

		System.gc();

		EmployeeClass e3 = new EmployeeClass();
		e3.name = "Peter";
		e3.age = 40;
		System.out.println(e3.name);

		//e3 = null;
		System.out.println(e3.name);// NullPointerException - NPE

	}

}
