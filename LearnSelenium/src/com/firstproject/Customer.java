package com.firstproject;

public class Customer {
	
	public static void main(String[] args) {
		LearnInterface obj= new LearnInterface();
		boolean proof=obj.AddressProof();
		System.out.println(proof);
			obj.AdharMandatory();
			obj.PANMandatory();
			obj.ICICIloan();
		}
	}
	
	


