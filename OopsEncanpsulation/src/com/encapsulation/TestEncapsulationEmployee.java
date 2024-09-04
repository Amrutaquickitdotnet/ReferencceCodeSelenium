package com.encapsulation;

public class TestEncapsulationEmployee {


	//Class is blueprint which may contains properties , methods and Object 
	public static void main(String[] args) {
	// Object => Anything 
		//Class==> Objects
		//First Aid box => bandage , lotion , scissor, cotton
		Employee e = new Employee();
		e.setAge(34);
		e.setEmpID("Emp001");
		e.setName("Amruta");
		System.out.println("Employee Age"+" "+ e.getAge());
		System.out.println("Employee Name"+" "+e.getName());
		System.out.println("Employee Id"+ " "+e.getEmpID());
		

}
}