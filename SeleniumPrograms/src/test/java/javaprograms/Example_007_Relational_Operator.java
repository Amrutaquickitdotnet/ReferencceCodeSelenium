package javaprograms;



// This program illustrate Arithmatic operator
public class Example_007_Relational_Operator 
{
	

public static void main(String[] args)// Static method 
{
	int Ten = 10;
	int Twenty = 20;
	int Thirty = 30;
	int fourty = 9;
	System.out.println("Greater and Greater than equal to operator ");
	System.out.println("Ten >twenty====>"+ (Ten>Twenty));
	System.out.println("Twenty >Ten====>"+ (Twenty>Ten));
	System.out.println("Ten >twenty====>"+ (Ten>Twenty));
	System.out.println("Thirty >twenty====>"+ (Thirty>Twenty));
	System.out.println("fourty=Ten====>"+ (fourty >= Ten));// 40=10
	System.out.println("**************************");
	System.out.println("less and lesser than equal to operator ");
	System.out.println("Ten >twenty====>"+ (Ten<Twenty));
	System.out.println("Twenty >Ten====>"+ (Twenty<Ten));
	System.out.println("Ten >twenty====>"+ (Ten<Twenty));
	System.out.println("Thirty >twenty====>"+ (Thirty<Twenty));
	System.out.println("fourty=Ten====>"+ (fourty <= Ten));// 40=10
	System.out.println("**************");
	System.out.println("equal to Operator ");
	
	System.out.println("fourty=Ten====>"+ (fourty == Ten));//9==10// false
	System.out.println("fourty=Ten+twenty====>"+ (fourty == Ten+Twenty));// 9 == 10+20 ; 9==30 //false;
	System.out.println("fourty=Twenty+twenty====>"+ (fourty == Twenty+Twenty));
	
	
}
}
