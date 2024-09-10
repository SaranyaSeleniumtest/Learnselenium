package com.firstproject;

public class Learnthiskey {
	int c=8;
	
	public void calculate() {  //local variable
		
		System.out.println(this.c);
		this.sum(5, 7);
	}

	public void sum(int a, int b) {
		System.out.println(a+b);
			
		}
		
	
	public static void main(String[] args) {
		Learnthiskey obj1= new Learnthiskey();
		obj1.calculate();
		
	}
}
