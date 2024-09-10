package com.firstproject;

public class LearnInterface  implements RBI {

	//must implement inherited abstract methods
	
	public void ICICIloan() {
		int max = RBI.maxloan;
		System.out.println("Eligible "+ max +" loan");
	}
	
	@Override
	public void PANMandatory() {
		System.out.println("iccibank");
		
	}

	@Override
	public void AdharMandatory() {
	System.out.println("adhar attached");
		
	}

	@Override
	public boolean AddressProof() {
		return true;
		
		
	}

	
	
}
