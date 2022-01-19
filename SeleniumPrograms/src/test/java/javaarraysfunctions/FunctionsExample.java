package javaarraysfunctions;
public class FunctionsExample {
// f5 - enter the function
	public static void main(String[] args) {
		System.out.println("A");
		int r = add(10,20,30);
		System.out.println("Returned sum is "+r);
		add(20,30,30);
		add(30,10,50);
		System.out.println("B");
		boolean result = isWordPresent("This is not a very good idea","cup");
		System.out.println(result);
		login("x","y","success");

	}
	
	public static int add(int a,int b, int c) {
		System.out.println("adding "+ a+", "+b+" and "+c);
		int res = a+b+c;
		System.out.println(res);
		
		return res;
	}
	// word present - true
	// word not present - false
	public static boolean isWordPresent(String str, String word) {
		int x=100;// mandatory to init the variables
		if(str.indexOf(word) == -1)
			return false;
		else
			return true;
	}
	
	public static void xyz(String x, int y, boolean z) {
		
	}
	
	public static boolean login(String username, String password, String expectedResult) {
		return true;
	}
	

}
