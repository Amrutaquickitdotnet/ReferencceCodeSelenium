package javaprograms;


// This program illustrate Arithmatic operator
public class Example_006_Arithmatic_Operator 
{
	



public static void main(String[] args)// Static method 
{
	int a;
	int b = 11;
	int c =5;
	a= b+c;
	System.out.println("Value of a after addition : "+a);
	
	a= b-c;
	System.out.println("Value of a after substraction : "+a);
	a= b*c;
	System.out.println("Value of a after multiplication : "+a);
	a= b/c;
	System.out.println("Value of a after division : "+a);
	a= b%c;
	System.out.println("**********below code are for postincrement and postdecrement*****");
	b++;//b++ = b = b+1   b = 11+1
	System.out.println("Value of b is : "+b);
	c--;// 5-1 = 4;
	System.out.println("Value of c is: "+c);
	System.out.println("*************");
	System.out.println("**********below code are for Preincrement and postincrement*****");
	System.out.println("Value of b is "+b);
	++b;//++b ==> increment only 1 1 + 12 = 13;
	System.out.println("Value of b is : "+b);
	System.out.println("Value of C s" +c);
	--c;// -1+4 = 3  incre/decre by 1 + assigning value of variable
	System.out.println("Value of c is: "+c);
	c++;// 3+1  // First Assigning value of variable + then increment by 1
	System.out.println("Value of c is "+c);
	
	
}
}
