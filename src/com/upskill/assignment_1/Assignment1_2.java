package com.upskill.assignment_1;

public class Assignment1_2 {

	public static void main(String[] args) {
		/*A rectangle width and length are: 9 and 13 inches. 
		Write a method to display the perimeter of rectangle in console output.*/
		myMethod2();
	}
		public static void myMethod2() {
		
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
		 System.out.println("The perimeter of the rectangle is " +c + " inches");

		}

		
		
		
		
		//or
		Assignment1_2 obj = new Assignment1_2 (); {
		obj.myMethod21(); }

	public void myMethod21() {
		int d = 9;
		int e = 13;
		int f = 2*(d+e);
	System.out.println("The perimeter of the rectangle with arm 9 and 13 is "+f);
		
	}
	
}


