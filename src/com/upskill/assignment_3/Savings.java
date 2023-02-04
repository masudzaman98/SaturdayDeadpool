package com.upskill.assignment_3;

public class Savings extends Assignment3_1 {

	public Savings(String string) {
		super(string);
		
	}

	public static void main(String[] args) {
			Savings s = new Savings(accname);
			s.deposit(5000);
			Checking c = new Checking();
			c.deposit(6000);
			c.withdraw(3000);
		}
	}


