package javaprograms;


public class Example_019_assigndefaultvaluestoconstructor 
{
// class member variables
	String smodel;
	int igear;
	int ispeed;
	String colour;
	int tyres;
	int doors;
	boolean bLeftHandDrive;
	
	public  Example_019_assigndefaultvaluestoconstructor()
	{
		smodel ="camry";
		bLeftHandDrive = true;
	
		
	}
public void displaycharacteristics() {
		
		System.out.println("Model of my car"+smodel);
		System.out.println("Model of my car"+igear);
		System.out.println("Model of my car"+ispeed);

	}
	
}