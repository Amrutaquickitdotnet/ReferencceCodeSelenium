package collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class SampleListprogram {

	public static void main(String[] args) {
		//String s[] = new String[105];
		
		
		// no final size, dynamically growing
		List<String> l = new ArrayList<String>();
		System.out.println(l.size());
		l.add("Apple");//0
		l.add("Mango");//1
		l.add("Kiwi");//2
		System.out.println(l.size());
		System.out.println(l.get(0));
		
		// index based
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		// Type
		for(String s : l) {
			System.out.println(s);
		}
		
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(100);
		l1.add(200);
		
		List<String>  l3 = new ArrayList<String>();
		l3.add("hello");
		//l3.add(100);
		
		
		Hashtable<String,String> table = new Hashtable<String,String>();// key , value
		table.put("name", "Amruta");
		table.put("place", "India");
		table.put("tool", "Selenium");
		table.put("tool", "Appium");
		table.put("key", "value");
		
		System.out.println(table.get("tool"));
		
		//table.keySet();
		
		// Set - multiple windows
		
		


	}

}
