package com.polymorphismOverloading;

public class TestCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Calculator c = new Calculator();
		c.sum();
		
		System.out.println("Passing double parameter"+c.sum(10.20, 345.456));
		
		System.out.println("Passing integer numbers"+c.sum(10, 10, 10));
      
      
	}

}
