package com.firstproject;

import java.util.Scanner;

public class LearnExceptionHandling {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try {
			int obj = sc.nextInt();
			int a=obj/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.err.println("Error is"+ e.getMessage());
			//e.printStackTrace();
			
		}catch(Exception e){
			System.out.println("Unknown error" + e.getMessage());
			
		}
		finally {
			System.out.println("Completed");
		}
		
	}

}
