package javaarraysfunctions;
public class StringOperations {

	public static void main(String[] args) {
		String str1 = "Today is a fine day. We are learining";
		String str2 = "Today is a fine day. We are learining";
		
		//System.out.println(str1 == str2);// do not use ==
		int chars = str1.length();
		System.out.println(chars);
		
		boolean b = str1.equals(str2);
		
		if(str1.equals(str2)) 
			System.out.println("Both are equal");
		
		
		//str1  = str1.substring(1,2);// 1-9
		//System.out.println(str1);
		
		int i = str1.indexOf("xxxx");
		//System.out.println(str1.substring(i));
		System.out.println(i);
		if(str1.indexOf("learining") != -1) {
			String s = str1.replace("learining", "learning");
			System.out.println(s);
			
			s = str1.replaceAll(" ", "_");
			System.out.println(s);
		}
		
		System.out.println(str1.charAt(2));
		String s1 = "   Concatenation and comparison operators   ";
		System.out.println(s1.trim());
		
		// database, xls, json, properties, yaml
		// Username,UserName, username
		String x = "Username";
		String y= "userName";
		System.out.println(x.equals(y));
		System.out.println(x.equalsIgnoreCase(y));
		// split
		String transactionString = "Your order is. Transaction ID is 1726761623";
		String result[] = transactionString.split(" ");
		System.out.println(result.length);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		System.out.println(result[result.length-1]);
		
		
		

	}

}
