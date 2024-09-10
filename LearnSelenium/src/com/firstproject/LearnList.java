package com.firstproject;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	//List is an interface
	//List allows duplicate
	// List order is maintained
	//we can grow list at any time. size not fixed like an array
	//add,contains,remove,clear
	
	void fruits() {
		
		List<String> fru= new ArrayList<String>();
		fru.add("mango");
		fru.add("banana");
		fru.add("kiwi");
		boolean contains = fru.contains("mango");
		System.out.println(contains);
	/*	for (String eachfruit : fru) {
			System.out.println(eachfruit);
			
		}*/
		System.out.println(fru.size());
		System.out.println(fru.get(0));
		
		for (int i = 0; i < fru.size(); i++) {
			System.out.println(fru.get(i));
			
		}
		
	}
	
	
	public static void main(String[] args) {
		LearnList lst= new LearnList();
		lst.fruits();
	}

}
