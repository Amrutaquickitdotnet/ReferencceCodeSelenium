package testrunner;

import TestBase.Testbase;
import keyworddriven.KeywordDriven;


public class testrunner {

	public static void main(String[] args) {
		
		      Testbase base = new Testbase(); //object of test base is created
		      
		      KeywordDriven kd = new KeywordDriven();
		      kd.readdata();
			}

		

	}


