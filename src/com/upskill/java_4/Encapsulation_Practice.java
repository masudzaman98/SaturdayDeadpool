package com.upskill.java_4;

public class Encapsulation_Practice {

	

		private String name = "Masud";
		private int ID = 1234;
		private String vehicle = "Toyota";
		
		
		
		
		public static void main(String[] args) {
			Encapsulation_Practice obj = new Encapsulation_Practice();
			obj.Setname("Fariyan");
			System.out.println("New name is " + obj.Getname() );
			

		}

		// Setter method - name 
		
		public void Setname(String value){
			name = value;
		}
		
		// Getter Method - name 
		
		public String Getname(){
			return name;
		}
		
		
}