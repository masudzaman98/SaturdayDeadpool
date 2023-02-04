

package com.upskill.assignment_3;
/*Problem 3.	Bank is a class that provides functionality to get interest rate.     
* Display different interest rate using rate functionality for Chase, City and TD banks followed by 8%, 7% and 9%. 
* Hints: using method override. */


public class Assignment3_4 {

	public static void main(String[] args) {
		
	}
		void displayInterestRate(){
			System.out.println("Default interest rate is NONE");
		}

		public static void main1(String[] args) {
         Assignment3_4 obj=new Assignment3_4();
			obj.displayInterestRate();
			new CityBank().displayInterestRate();
			new TDBank().displayInterestRate();
		}



}
