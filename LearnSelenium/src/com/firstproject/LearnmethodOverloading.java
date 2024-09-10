package com.firstproject;

public class LearnmethodOverloading {
	public static void main(String[] args) {
		LearnmethodOverloading obj1= new LearnmethodOverloading();
		obj1.Score("99");
		
		obj1.Score("pass A+");
		
		obj1.Score(true);
	}
	public void Score(int mark) {
		System.out.println(mark);
	}
	
	public void Score(String mark1) {
		System.out.println(mark1);
		
	}
	
	public void Score(boolean pass) {
		System.out.println(pass);
	}


}