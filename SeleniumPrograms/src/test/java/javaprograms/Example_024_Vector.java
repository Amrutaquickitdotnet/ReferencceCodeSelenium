package javaprograms;


import java.util.Iterator;
import java.util.Vector;

public class Example_024_Vector {

	public static void main(String[] args) {
		
//synchronised and contains many methods
		Vector<String> v = new Vector<String>();
		v.add("Pooja");
		v.add("kirti");
		v.add("jungle");
		v.add("Pooja");
		v.add("kirti");
		 Iterator<String> itr  =  v.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
	}

}
