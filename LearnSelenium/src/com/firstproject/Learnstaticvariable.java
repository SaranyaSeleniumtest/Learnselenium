package com.firstproject;

public class Learnstaticvariable {
	
	int instana;
	static int x;
	
	public void increament() {
		instana++;
		x++;
		System.out.println("nonstaticvar:"+ instana);
		System.out.println("staticvariable:"+ x);
	}
	
	public static void main(String[] args) {
		Learnstaticvariable ls= new Learnstaticvariable();
		ls.increament();
		ls.increament();
		ls.increament();
		Learnstaticvariable ls1= new Learnstaticvariable();
		//while created new objects, the value of instance variable initialize from beginning.

		ls1.increament();
		ls1.increament();
		
	}
	
	

}
