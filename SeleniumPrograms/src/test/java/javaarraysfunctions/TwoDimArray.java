package javaarraysfunctions;
public class TwoDimArray {

	public static void main(String[] args) {
		String str[][] = new String[3][4];// [row][col]
		// row 1
		str[0][0]="email@gmail.com";
		str[0][1]="8977575110";
		str[0][2]="pass1234";
		str[0][3]="Mozilla";
		
		// row 2
		str[1][0]="email1@gmail.com";
		str[1][1]="8977575110";
		str[1][2]="pass1234123123";
		str[1][3]="Chrome";		

		// row 3
		str[2][0]="email3@gmail.com";
		str[2][1]="89778385110";
		str[2][2]="pass";
		str[2][3]="Edge";	
		
		System.out.println(str.length);
		System.out.println(str[0].length);
		
		for(int rNum=0;rNum<str.length;rNum++) {
			System.out.println("Row number is "+rNum);
			for(int cNum=0;cNum<str[rNum].length;cNum++) {
				String data = str[rNum][cNum];
				System.out.println(data);
				// 0 , 0
				// 0 , 1
				// 0 , 2
				// 0 , 3
				// 0 , 4
				
				// 1 , 0
			}
		}
		
		
		
	}

}
