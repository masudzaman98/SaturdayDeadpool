package com.upskill.java_assignment_2;

public class Assignment2_5 {

	public static void main(String[] args) {
		/*5.  Write a program in Java to display the multiplication table of (eight)8.
		 */
		myMethod();
	}

	public static void myMethod() {
	
		for (int row = 1; row <= 8; row++) {
			for (int col = 1; col <= 8; col++) {
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}
	}



	}


