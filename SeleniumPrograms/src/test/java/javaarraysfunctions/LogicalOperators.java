package javaarraysfunctions;;
public class LogicalOperators {
// & &&
	public static void main(String[] args) {
		int a=1000;
		int b= 200;
		int c=300;
		int d=400;
		
		//a<b and c <d
		// & && | ||
		if(isLoggedIn()  || isInboxLinkPresent() ) {
			
				System.out.println("Compose mail");
			
		}
				

	}
	
	public static boolean isLoggedIn() {
		System.out.println("isLoggedIn");
		return true;
	}
	
	
	public static boolean isInboxLinkPresent() {
		System.out.println("isInboxLinkPresent");
		return true;

	}

}
