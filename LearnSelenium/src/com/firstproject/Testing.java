package com.firstproject;

import java.util.ArrayList;
import java.util.List;

public class Testing {

	int a;
	
	
	public static void main(String[] args) {
	Testing obj= new Testing();
	//obj.tools();
	//obj.age(25);
	//obj.lst();
	obj.array1();

	}
	
	
	public void tools() {
		
		String t[]= {"qtp","selenium","jira","hp"};
		System.out.println(t.length);
		System.out.println(t[0]);
		System.out.println(t[(t.length)-1]);
	}

	public void age(int a) {
		this.a=a;
		if
			(a==25) { 
			System.out.println("true");
			
		}
		int y[]= {25,34,77};
		System.out.println("my age "+y[2]);
		
	}
	
	
	public void lst() {
		
		List<String> obj= new ArrayList<String>();
		obj.add("dog");
		obj.add("cat");
		obj.add("ox");
		obj.add("monkey");
		int size = obj.size();
		System.out.println(size);
		boolean contains = obj.contains("ox");
		System.out.println(contains);
		System.out.println(obj.get(3));
		for (String animals : obj) {
			System.out.println(animals);
			
			
		}
	}
		
		public void array1() {
			
		String[]weeks= {"mon","tue","wed","thu","fri","sat","sun"};
		int length = weeks.length;
		
		System.out.println(length);
	//	System.out.println(weeks[6]);
		for (String week : weeks)
		{
			System.out.println(week);
			if(week.equalsIgnoreCase("thu")) {
				System.out.println("week is thur");
				
			}
		}
	
		
	} 
}
