package com.upskill.java_assignment_2;
/* Problem9. Write a program to swap two string variables (Talen, Tech) and display result on the screen. */
public class Assignment2_9 {

	public static void main(String[] args) {
		myMethod();
	}
	public static void myMethod(){
		String a = "Masud";
		String b = "Zaman";
		
		String swap = a;
		a = b;
		b = swap;
		
		System.out.println("Swap value a: "+a);
		System.out.println("Swap Value b: "+b);


	}

}
