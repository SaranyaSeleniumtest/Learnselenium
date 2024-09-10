package com.firstproject;

public class LearnConstructor {
	
	int a;
	String b;
	boolean c;
	float d;
	char e;
	
	public void displayvalues() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
	//constructor doesnt return any value
	public LearnConstructor(int a) {
		this.a=a; // assign instance variable new value
		this.b="test constructor";
	}
	
	public LearnConstructor(int a,String b) {
		this.a=a; // assign instance variable new value
		this.b=b;
	}
	public static void main(String[] args) {
		//LearnConstructor ls= new LearnConstructor(1000);
		LearnConstructor ls= new LearnConstructor(100,"Test"); //parameter constructor
		ls.displayvalues();
		
	}

}
