package javaprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Example_022 {

	public static void main(String[] args) {
		
// List Interface 	is child interface of collection interface.
		
		// is implemented by classes  ArrayList, LinkedList=> DoubleLinkedList, Vector, Stack
		//<E >says as "Generic" data type
		ArrayList<String> list1 = new ArrayList<>();
		  //List<String> list1 = new ArrayList<String>();
		  list1.add("Pooja");//0
		  list1.add("Kirti");//1
		  list1.add("Kirti");//2
		  
		  //traversing list through iterator
		  Iterator<String> itr  =  list1.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		 
		/*
		 * Customer c = new Customer(); c.accessroom(); Restaurant rest = new
		 * Restaurant(); rest.accessroom();
		 */
		
	}

}
