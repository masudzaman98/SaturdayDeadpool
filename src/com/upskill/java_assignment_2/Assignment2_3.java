package com.upskill.java_assignment_2;

public class Assignment2_3 {

	
		/* Write two java functions which will return two different integer values, write a 
     program to compare those numbers and send message that one number is bigger */

		public static int a;
		public static int b;
		
		public static void main(String[] args) {
			a = myFunction1();
			b = myFunction2();
			myMethod();
			
		}
		
		public static int myFunction1(){
			return 55;
		}
		public static int myFunction2(){
			return 65;
		}
		public static void myMethod(){
			if (a>b);{
				System.out.println("1st Function is bigger then 2nd Function");}
			if (a<b);{
				System.out.println("2nd Function is bigger then 1st Function");}
		}
	}


	
	
	


