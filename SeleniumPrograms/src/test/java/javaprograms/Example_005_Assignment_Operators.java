package javaprograms;

// This program illustrate Assignment operator
public class Example_005_Assignment_Operators 
{
	

	//Static is sharable Object
	/*
	 * Static variables easily access to static methods
	 *  Static variables  not easily access to Non static methods 
	 *  non static  variables can not  access to static methods
	 */
	 static int speed = 80;// Properties of Class, Static variables easily access to static methods// class variables, global variable
	 static int distance = 20;
	 static int time = 10;
	 static String name = "qickitdotnet";
	 static boolean isGood = true;

	



public static void main(String[] args)// Static method 
{
	System.out.println("Value Stored under Speed"+":"+speed);
	System.out.println("Value Stored under distance"+":"+distance);
	System.out.println("Value Stored under time"+":"+time);
	System.out.println("Value Stored under name"+":"+name);
	System.out.println("Value Stored under isGood"+":"+isGood);
	speed= 100;
	time = distance;// Assigning value of distance to time // right to left
	name ="pooja";
	isGood = false;
	System.out.println("************After overriding the changes ****************");
	System.out.println("Value Stored under Speed"+":"+speed);
	System.out.println("Value Stored under distance"+":"+distance);
	System.out.println("Value Stored under time"+":"+time);
	System.out.println("Value Stored under name"+":"+name);
	System.out.println("Value Stored under isGood"+":"+isGood);
	speed = distance = 0 ;// 100    100= (20=0)=0;// multiple assigment
	//20=0
	System.out.println("Value Stored under Speed"+":"+speed);
	
	
}
}
