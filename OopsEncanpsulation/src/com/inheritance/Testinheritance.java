package com.inheritance;

public class Testinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Developers dev = new Developers();
		System.out.println("Developer salary is "+dev.salary);
		
		System.out.println("Developer salary is "+dev.bonus);
		
		Employee e = new Employee();
		
		System.out.println("Employee salary is "+e.salary);

	}

}
