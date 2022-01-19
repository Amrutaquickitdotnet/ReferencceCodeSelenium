package javaprograms;


import java.util.Scanner;

// This program illustrate Arithmatic operator
public class Example_013_switch_case {

	public static void main(String[] args)// Static method
	{
		// Classname  variablename = new ClassName();
		
		Scanner  s = new Scanner(System.in);
		System.out.println("Please choose option");
		String choice =s.next();
		switch (choice) {
		case "One": {
			System.out.println("you are taking black cofee");
			break;
		
		}
		case "Two":
			
		{
			
			System.out.println("you are taking Mocha");
			break;
		}
		case "Three":{
			System.out.println("you are taking hot cofee");
			break;
		}
		default:
			System.out.println("Invalid option");
		}
		s.close();// Thread -safe
	}
}
