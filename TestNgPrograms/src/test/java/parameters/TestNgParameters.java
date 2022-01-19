package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameters {
	
	  
	    @Parameters ({"val1", "val2"})
	    @Test
	    public void Sum(int v1, int v2) {
	    	int finalsum = v1 + v2;
	        System.out.println("The final sum of the given values is " + finalsum);
	    }
	}

