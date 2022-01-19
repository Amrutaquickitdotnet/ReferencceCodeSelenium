package javaprograms;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Example_023_Stack {

	public static void main(String[] args) {
		
//synchronised and contains many methods
		Stack<String> stack = new Stack<String>();
		stack.push("One");
		stack.push("Two");
		stack.push("One");
		stack.push("Three");
		stack.push("Four");
		
		 Iterator<String> itr  =  stack.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
	}

}
