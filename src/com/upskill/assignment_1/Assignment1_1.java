package com.upskill.assignment_1;

public class Assignment1_1 {

	public static void main(String[] args) {
		// 1.1 A triangle three arms are: 5, 7 and 11 inches. 
		//Write a method to display the perimeter of triangle in console output.
              myMethod1(); 
	}
	
		public static void myMethod1(){
	           int a = 5;
	           int b = 7;
	           int c = 11;
	           int perimeter = a + b + c;
	     System.out.println("The perimieter of the triangle with arms 5, 7 and 11 inches is " + perimeter + " inches");
		}

}
