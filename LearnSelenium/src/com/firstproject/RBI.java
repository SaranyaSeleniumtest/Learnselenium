package com.firstproject;

public interface RBI {
	
	int maxloan =370000;
	// set of rules
	/*Set of rules
	Abstract function- by default access modifier is public
	variables: static final sf (value cant be changed)
	implement inherited abstract class*/
	
	public void  PANMandatory();
	
	public void AdharMandatory();
	
	public boolean AddressProof();
	
	default void test() {
		
	}
	
	static void test2() {
		
	}
		

}
