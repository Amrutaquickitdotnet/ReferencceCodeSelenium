package javaprograms;


public class Example_018_buildingconstructor 
{
// class member variables
	String smodel;
	int igear;
	int ispeed;
	String colour;
	int tyres;
	int doors;
	boolean bLeftHandDrive;
	
	public Example_018_buildingconstructor(String model, int gear, int speed) //user defined constructor// Parameterised constructor
	{
		//pass value to constructor
		smodel=model;
		igear =gear;
		ispeed=speed;
		
	}
public void displaycharacteristics() {
		
		System.out.println("Model of my car"+smodel);
		System.out.println("Model of my car"+igear);
		System.out.println("Model of my car"+ispeed);
	}
	
}