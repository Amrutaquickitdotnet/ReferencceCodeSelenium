package javaprograms;



// This program illustrate Arithmatic operator
public class Example_009_ternary_Operator 
{
	

public static void main(String[] args)// Static method 
{
	int Ten = 10;
	int Twenty = 20;
	int Thirty = 30;
	
	boolean bValue;
	int iValue;
	
	bValue =(Thirty == Twenty+Ten)? true: false;// 30==(20+10) // true
	System.out.println(bValue);
	
	bValue =(Thirty == Twenty+Thirty)? true: false;// 30==(20+10) // false
	System.out.println(bValue);
	
	iValue =((Thirty== Twenty+Ten))? 50: 100;// 
	System.out.println(iValue);// 50   30==30?50
	
	
	iValue =(!(Thirty== Twenty+Ten))? 50: 100;
	System.out.println(iValue);//100
}
}
