package com.upskill.assignment_1;

public class Assignment1_5 {

	public static void main(String[] args) {
		/* Problem 05: Write a java program which will display name and guestimated age of every students in your class.
		(write separate method for every student). */



				
				Assignment1_5 obj = new Assignment1_5();  
				obj.myMethod51();
				
				myMethod52();
				
				int a= myMethod53();                     // return type method  - You declare a method's return type 
				                                       //in its method declaration. 
				                      //Within the body of the method, you use the return statement to return the value
				                                
				System.out.println("Age of Masud is "+a);
			}
			public void myMethod51(){                             // void method 
				int a=24;
				System.out.println("Age of Masood is "+a);
			}
			public static void myMethod52(){                      // static method 
				int a=25;
				System.out.println("Age of Mas'oud is "+a);
			}
			public static int myMethod53(){            //return-type method
				int a=26;
				return a;
			}
		


	}


