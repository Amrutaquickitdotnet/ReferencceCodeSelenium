package com.polymorphism;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ReserveBank bank;
      
      bank = new SBIBank();
    System.out.println("Rate of interest for SBI Bank"+  bank.getRateOfInterest());
      
      
      bank = new HDFCBank();
      bank.getRateOfInterest();
      System.out.println("Rate of interest for HDFC Bank"+ bank.getRateOfInterest());
      
      
	}

}
