package ooEncapsulation;

import constructorConcept.Emp;

public class RunnerEmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
//		emp.setAge(23);
//		emp.setName("NAveen");
//		emp.setSalary(2309990);
		
		emp.setAge(24);
		emp.getSalary();
		
		System.out.println(emp.getAge());
		System.out.println(emp);

	}

}
