package com.firstproject;

import java.util.Arrays;

public class Learnarray {

	String a[]= {"apple","banana","kiwi","guava"};
	
	void readfruits() {
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[(a.length)-1]);
		
	}
	
	public void readstates() {
		String states[]= {"CA","OH","GA","NY"};
		System.out.println(Arrays.toString(states));
		System.out.println(states[0]);
		System.out.println(states[states.length-1]);
	}
	
	public static void main(String[] args) {
		
		Learnarray ls=new Learnarray();
		//ls.readfruits(); // output [apple, banana, kiwi, guava]
		ls.readstates();
	}
	
}
