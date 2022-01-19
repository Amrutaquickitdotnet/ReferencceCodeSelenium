package javaprograms;



public class Example_015_Array_singledimensional2 {

	public static void main(String[] args)// Static method
	{
		String[]brand = {"BMW", "Honda", "Audi"}		;
		
	int iLength =	brand.length;
	System.out.println("Length of Array :"+ iLength);
	
	//Accessing first Element of array directly with the position
	String sBMW =brand[0];
	System.out.println("First value of Array Container is : "+ sBMW);
		
// Accessing last Element of Array directly with the position
	
	String sLastElement =brand[iLength -1];
	System.out.println("last value of Array Container is : "+ sLastElement);
	System.out.println("****************************");
	
	for(int i =0; i<= iLength-1 ;i++) {
		
		System.out.println(brand[i]);
	}
	}
}