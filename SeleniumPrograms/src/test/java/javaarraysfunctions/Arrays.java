package javaarraysfunctions;
public class Arrays {

	public static void main(String[] args) {
		// Test Data storage
		// Username, Password, Email, Phone, Zip code
		
		String arr[] = new String[5];
		arr[0]="quickitdotnet@gmail.com";
		arr[1]="username";
		arr[2]="xxx";
		arr[3]="18728172";
		arr[4]="160020";
		
		System.out.println(arr[3]);
		arr[3]="UK";
		System.out.println(arr[3]);
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		int  iArr[] = new int[3];
		iArr[0]=100;
		iArr[1]=200;
		iArr[2]=300;
		
		
		Object[] data = new Object[5];
		data[0]="Hello";
		data[1]=100;
		data[2]=19.45;
		data[3]=true;
		data[4]="there";
		

	}

}
