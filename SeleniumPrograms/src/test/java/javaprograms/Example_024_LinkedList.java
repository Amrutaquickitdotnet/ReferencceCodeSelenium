package javaprograms;


import java.util.Iterator;
import java.util.LinkedList;


public class Example_024_LinkedList {

	public static void main(String[] args) {
		
// List Interface 	is child interface of collection interface.
		
		// is implemented by classes  ArrayList, LinkedList=> DoubleLinkedList, Vector, Stack
		//<E >says as "Generic" data type
		LinkedList<String> list1 = new LinkedList<String>();
		  //List<String> list1 = new ArrayList<String>();
		//FIFO
		  list1.add("India");//0
		  list1.add("Kirti");//1
		  list1.add("Pooja");//2
		  list1.add("Jungle");//3
		  
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
