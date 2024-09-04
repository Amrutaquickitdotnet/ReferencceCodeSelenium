package com.polymorphismOverloading;

public class Calculator {

	public int sum(int a, int b, int c) {

		return a + b + c;
	}

	public double sum(double a, double b) {

		return a + b;
	}
	
	protected void sum() {
		System.out.println("Nothing to sum");
	}
}
