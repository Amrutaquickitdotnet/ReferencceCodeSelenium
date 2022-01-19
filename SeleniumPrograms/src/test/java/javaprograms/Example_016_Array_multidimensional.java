package javaprograms;

public class Example_016_Array_multidimensional {

	public static void main(String[] args)// Static method
	{
		String[][] cred = new String[3][2];
		cred[0][0] = "admin1";
		cred[0][1] = "pwd1";
		
		cred[1][0] = "admin2";
		cred[1][1] = "pwd2";
		
		cred[2][0] = "admin3";
		cred[2][1] = "pwd3";
		
		for(int i =0; i<3; i++)
		{
			for(int j =0; j<2; j++) {
				System.out.println("Value of credential arrays are"+"["+i+"]["+j+"]"+":::"+ cred[i][j]);
			}
		}
	}
}