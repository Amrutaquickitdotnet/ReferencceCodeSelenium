package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// no duplicate elements
		// no index
		// un order
		Set<String> s = new HashSet<String>();
		System.out.println(s.size());
		s.add("India");
		s.add("Indonesia");
		s.add("China");
		s.add("UK");
		s.add("UK");
		System.out.println(s.size());
		
		Iterator<String> it = s.iterator();
	
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
