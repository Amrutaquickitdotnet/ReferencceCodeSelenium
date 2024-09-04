package com.encapsulation;

public class Employee
{
	
	// defining Data members // sub process of data hiding 
	 private String EmpID;
	private String Name;
	private int age;
	public String getEmpID() {
		return EmpID;
	}
	public void setEmpID(String empID) {
		EmpID = empID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Defining methods 
	
//	public int getAge() {
//		return age;
//	}
//	
//	public String getName(){
//		return Name;
//	}
//	
//	public String getEmpID(){
//		return EmpID;
//		
//	}
//	
//	public void setAge(int newAge) {
//		age = newAge;
//	}
//
//	public void setName(String EmpName) {
//		Name = EmpName;
//	}
//	public void setEmpID(String EmployeeID) {
//		EmpID = EmployeeID;
//	}
}
